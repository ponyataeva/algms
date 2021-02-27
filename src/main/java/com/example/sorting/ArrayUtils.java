package com.example.sorting;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class ArrayUtils {

    /**
     * Performs a routine operation of swapping two elements in the source array
     *
     * @param source contains the elements to be swapped
     * @param i's    value will be swapped to j's value
     * @param j's    value will be swapped to i's value
     */
    public static void swap(int[] source, int i, int j) {
        var tmp = source[i];
        source[i] = source[j];
        source[j] = tmp;
    }
}
