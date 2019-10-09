package ua.dmytrokashchenko.lesson10.homework;

public interface MyList<E> {
    public int size();

    public boolean isEmpty();

    public void add(E element);

    public E getByIndex(int index);

    public boolean remove(E element);

    void clean();
}
