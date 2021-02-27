package com.example.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearch_whenTargetElementLast_thenFindIt() {
        var actual = BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 6}, 6);

        assertEquals(4, actual.getResult());
    }

    @Test
    void binarySearch_whenArrayWithEvenLength_thenFindElement() {
        var actual = BinarySearch.binarySearch(new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, 23);

        assertEquals(5, actual.getResult());
    }

    @Test
    void binarySearch_whenElementNotInArray_thenReturnMinusOne() {
        var actual = BinarySearch.binarySearch(new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, 20);

        assertEquals(-1, actual.getResult());
    }

    @Test
    void binarySearch_whenFirstElement_thenFindIt() {
        var actual = BinarySearch.binarySearch(new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, 2);

        assertEquals(0, actual.getResult());
    }

    @Test
    void binarySearch_whenValueLowerThenMinimumValue_thenReturnMinusOne() {
        var actual = BinarySearch.binarySearch(new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, -1);

        assertEquals(-1, actual.getResult());
    }

    @Test
    void binarySearch_whenValueHigherThenMaxValue_thenReturnMinusOne() {
        var actual = BinarySearch.binarySearch(new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, 100);

        assertEquals(-1, actual.getResult());
    }

    @Test
    void binarySearch_whenFirstNegativeNumber_thenReturnMinusOne() {
        var actual = BinarySearch.binarySearch(new int[]{-2, -1, 5, 8, 12, 16, 23, 38, 56, 72, 91}, -2);

        assertEquals(0, actual.getResult());
    }

    @Test
    void binarySearch_whenNegativeNumber_thenReturnMinusOne() {
        var actual = BinarySearch.binarySearch(new int[]{-2, -1, 5, 8, 12, 16, 23, 38, 56, 72, 91}, -1);

        assertEquals(1, actual.getResult());
    }

    @Test
    void binarySearch_whenBigArray_thenFindNumber() {
        var array = new int[200000];
        for (int i = 0; i < 200000; i++) {
            array[i] = i;
        }
        var actual = BinarySearch.binarySearch(array, 183965);

        assertEquals(183965, actual.getResult());
    }

}