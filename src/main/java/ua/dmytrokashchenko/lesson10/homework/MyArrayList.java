package ua.dmytrokashchenko.lesson10.homework;

public class MyArrayList<E> implements MyList<E> {
    private static final int INITIAL_SIZE = 10;
    private Object[] elements;
    private int size;
    private int actualSize;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        int size = 0;
        actualSize = INITIAL_SIZE;
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
        if (size == actualSize) {
            actualSize = (size + 1) * 2;
            Object[] biggerArr = new Object[actualSize];
            if (elements.length - 1 >= 0) {
                System.arraycopy(elements, 0, biggerArr, 0, elements.length - 1);
            }
            elements = biggerArr;
        }
        elements[size++] = element;
    }

    @Override
    public E getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    @Override
    public boolean remove(E element) {
        for (int i = 0; i < size; i++) {
            if (element == elements[i]) {
                if (size * 4 < actualSize) {
                    actualSize = size * 2;
                }
                Object[] tempElements = new Object[actualSize];
                System.arraycopy(elements, 0, tempElements, 0, i);
                System.arraycopy(elements, i + 1, tempElements, i, size - i - 1);
                elements = tempElements;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clean() {
        elements = new Object[INITIAL_SIZE];
        int size = 0;
        actualSize = INITIAL_SIZE;
    }
}
