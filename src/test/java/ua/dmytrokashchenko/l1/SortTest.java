package ua.dmytrokashchenko.l1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void bubbleSortTest() {
        int[] array = new int[]{12, 10, 67, 35, 17};
        int[] expectedArray = new int[]{10, 12, 17, 35, 67};
        Sort.bubbleSort(array);
        assertArrayEquals(array, expectedArray);
    }

    @Test
    public void selSortTest() {
        int[] array = new int[]{12, 10, 67, 35, 17};
        int[] expectedArray = new int[]{10, 12, 17, 35, 67};
        Sort.selSort(array);
        assertArrayEquals(array, expectedArray);
    }

    @Test
    public void insSortTest() {
        int[] array = new int[]{12, 10, 67, 35, 17};
        int[] expectedArray = new int[]{10, 12, 17, 35, 67};
        Sort.insSort(array);
        assertArrayEquals(array, expectedArray);
    }
}