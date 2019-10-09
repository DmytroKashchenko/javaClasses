package ua.dmytrokashchenko.lesson10.homework;

public class MyLinkedList<E> implements MyList<E> {
    private ElementOfLinkedList<E> first;
    private ElementOfLinkedList<E> last;
    private int size;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(E element) {
        if (size != 0) {
            ElementOfLinkedList<E> newElement = new ElementOfLinkedList<>(element, last, null);
            last.next = newElement;
            last = newElement;
            size++;
        } else {
            first = new ElementOfLinkedList<>(element, null, null);
            last = first;
            size++;
        }
    }

    @Override
    public E getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        ElementOfLinkedList<E> current = first;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }

    @Override
    public boolean remove(E element) {
        if (size == 0) {
            return false;
        }
        ElementOfLinkedList<E> current = first;
        for (int i = 0; i < size; i++) {
            if (element == current.getData()) {
                if (current.getPrevious() != null && current.getNext() != null) {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                } else if (current.getPrevious() == null && current.getNext() != null) {
                    current.next.previous = null;
                    first = current.next;
                } else if (current.getPrevious() != null) {
                    current.previous.next = null;
                    last = current.previous;
                } else {
                    first = null;
                    last = null;
                }
                current.next = null;
                current.previous = null;
                current.data = null;
                size--;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public void clean() {
        if (size == 0) {
            return;
        }
        ElementOfLinkedList<E> current = first;
        ElementOfLinkedList<E> currentNext = null;
        for (int i = 0; i < size; i++) {
            current.data = null;
            currentNext = current.getNext();
            current.next = null;
            current.previous = null;
            current = currentNext;
        }
        currentNext = null;
        current = null;
        size = 0;
        first = null;
        last = null;
    }

    private static class ElementOfLinkedList<T> {
        private T data;
        private ElementOfLinkedList<T> previous;
        private ElementOfLinkedList<T> next;

        private ElementOfLinkedList(T data, ElementOfLinkedList<T> previous, ElementOfLinkedList<T> next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
        }

        private ElementOfLinkedList<T> getPrevious() {
            return previous;
        }

        private void setPrevious(ElementOfLinkedList<T> previous) {
            this.previous = previous;
        }

        private ElementOfLinkedList<T> getNext() {
            return next;
        }

        private void setNext(ElementOfLinkedList<T> next) {
            this.next = next;
        }

        private T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
