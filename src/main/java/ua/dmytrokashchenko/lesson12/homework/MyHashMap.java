package ua.dmytrokashchenko.lesson12.homework;

import java.util.*;

public class MyHashMap<K, V> implements MyMap<K, V> {
    private static final int INITIAL_SIZE = 10;
    private static final double MAX_LOADING = 0.8;
    private static final int MAX_CHAIN_SIZE = 8;
    private int capacity;
    private int size;
    private SinglyLinkedList[] keyToValue;

    public MyHashMap() {
        keyToValue = new SinglyLinkedList[INITIAL_SIZE];
        for (int i = 0; i < INITIAL_SIZE; i++) {
            keyToValue[i] = new SinglyLinkedList<K, V>();
        }
        capacity = INITIAL_SIZE;
        size = 0;
    }

    private int mapFunc(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    @SuppressWarnings("unchecked")
    @Override
    public V put(K key, V value) {
        double loading = (double) (size + 1) / (double) capacity;
        if (loading > MAX_LOADING || keyToValue[mapFunc(key)].getSize() > MAX_CHAIN_SIZE) {
            resize();
        }
        if (this.getByKey(key) == null) {
            size++;
        } else {
            keyToValue[mapFunc(key)].remove(key);
        }
        keyToValue[mapFunc(key)].add(key, value);
        return value;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        SinglyLinkedList[] newKeyToValue = new SinglyLinkedList[capacity * 2];
        for (int i = 0; i < capacity * 2; i++) {
            newKeyToValue[i] = new SinglyLinkedList<K, V>();
        }
        for (K key : this.keys()) {
            newKeyToValue[mapFunc(key)].add(key, this.getByKey(key));
        }
        capacity *= 2;
        keyToValue = newKeyToValue;
    }

    @SuppressWarnings("unchecked")
    @Override
    public V getByKey(K key) {
        return (V) keyToValue[mapFunc(key)].getByKey(key);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Collection<V> values() {
        List<V> values = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            if (keyToValue[i].first == null) {
                continue;
            }
            values.addAll(keyToValue[i].values());
        }
        return values;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Set<K> keys() {
        Set<K> keys = new HashSet<>();
        for (int i = 0; i < capacity; i++) {
            if (keyToValue[i].first == null) {
                continue;
            }
            keys.addAll(keyToValue[i].keys());
        }
        return keys;
    }

    private static class SinglyLinkedList<K, V> {
        private Element<K, V> first;
        private int size;

        private SinglyLinkedList() {
            this.first = null;
            size = 0;
        }

        private int getSize() {
            return size;
        }

        private boolean isEmpty() {
            return first == null;
        }

        private void add(K key, V element) {
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

        private V getByKey(K key) {
            if (isEmpty()) {
                return null;
            }
            Element<K, V> current = first;
            while (current != null && !current.getKey().equals(key)) {
                current = current.next;
            }
            return current == null ? null : current.getData();
        }

        private boolean remove(K key) {
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
            if (current != first && previous != null) {
                previous.next = current.next;
                current = null;
                size--;
                return true;
            }
            first = current.next;
            size--;
            return true;
        }

        private void clean() {
            first = null;
            size = 0;
        }

        private ArrayList<V> values() {
            ArrayList<V> values = new ArrayList<>();
            Element<K, V> current = first;
            while (current != null) {
                values.add(current.data);
                current = current.next;
            }
            return values;
        }

        private HashSet<K> keys() {
            HashSet<K> keys = new HashSet<>();
            Element<K, V> current = first;
            while (current != null) {
                keys.add(current.key);
                current = current.next;
            }
            return keys;
        }
    }

    private static class Element<K, V> {
        private final V data;
        private final K key;
        Element<K, V> next;

        private Element(K key, V data) {
            this.key = key;
            this.data = data;
        }

        private V getData() {
            return data;
        }

        private K getKey() {
            return key;
        }
    }
}
