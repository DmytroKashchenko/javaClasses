package ua.dmytrokashchenko.lesson10.homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {
    private MyList<String> testList;

    @Before
    public void setUp() throws Exception {
        testList = new MyLinkedList<>();
        testList.add("first element");
        testList.add("second element");
        testList.add("third element");
    }

    @Test
    public void sizeTest() {
        int expected = 3;
        int actual = testList.size();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNoEmpty() {
        boolean actual = testList.isEmpty();
        assertFalse(actual);
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void add() {
    }

    @Test
    public void getByIndex() {
    }

    @Test
    public void remove() {
    }
}