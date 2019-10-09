package ua.dmytrokashchenko.lesson12.homework;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MyHashMapTest {
    private MyHashMap<Integer, String> map;

    @Before
    public void setUp() {
        map = new MyHashMap<>();
        map.put(1, "String1");
        map.put(3, "Some string");
        map.put(5, "string2");
    }

    @Test
    public void shouldReturnValueForExistingKey() {
        String actual = map.getByKey(5);
        String expected = "string2";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNullForNonExistentKey() {
        String actual = map.getByKey(4);
        assertNull(actual);
    }

    @Test
    public void shouldReturnSize() {
        int expected = 3;
        int actual = map.size();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeEmpty() {
        boolean actual = map.isEmpty();
        assertFalse(actual);
    }

    @Test
    public void shouldBeEmpty() {
        map = new MyHashMap<>();
        boolean actual = map.isEmpty();
        assertTrue(actual);
    }

    @Test
    public void values() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("String1");
        expected.add("Some string");
        expected.add("string2");
        ArrayList<String> actual = (ArrayList<String>) map.values();
        assertEquals(expected, actual);
    }

    @Test
    public void keys() {
        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        Set<Integer> actual = map.keys();
        assertEquals(expected, actual);
    }
}