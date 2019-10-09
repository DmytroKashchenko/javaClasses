package ua.dmytrokashchenko.lesson12.homework;

/*
public class SinglyLinkedList<K, V> {
    private Element<K, V> first;
    private int size;

    public SinglyLinkedList() {
        this.first = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(K key, V element) {
        if (isEmpty()) {
            first = new Element<>(key, element);
            size++;
            return;
        }
        Element<K, V> current = first;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Element<>(key, element);
        size++;
    }

    public V getByKey(K key) {
        if (isEmpty()) {
            return null;
        }
        Element<K, V> current = first;
        while (current != null && !current.getKey().equals(key)) {
            current = current.next;
        }
        return current == null ? null : current.getData();
    }

    public boolean remove(K key) {
        if (isEmpty()) {
            return false;
        }
        Element<K, V> current = first;
        Element<K, V> previous = null;
        while (current != null && !current.getKey().equals(key)) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return false;
        }
        if (current != first && previous!= null) {
            previous.next = current.next;
            current = null;
            size--;
            return true;
        }
        first = current.next;
        size--;
        return true;
    }

    public void clean() {
        first = null;
        size = 0;
    }
}
*/
