package ua.dmytrokashchenko.lesson12.homework;

import java.util.Collection;
import java.util.Set;

public interface MyMap<K, V> {
    // loading 80% -> x2 capacity
    // + tests!!!!!
    // collision -> linked list
    // if 1 bucked > 8 node - new capacity!

    V put(K key, V value);

    V getByKey(K key);

    int size();

    boolean isEmpty();

    Collection<V> values();

    Set<K> keys();

}

