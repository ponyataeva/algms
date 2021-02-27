package com.example.sorting;

import lombok.NoArgsConstructor;
import com.example.model.Result;

/**
 * Recursive implementation of the bubble sort.
 * Based on the principal that the last element will always
 * be the biggest element in the array.
 *
 * Its execution time will always be O(n^2)
 */
@NoArgsConstructor
public final class BubbleSortRecursive {

    public static final String NAME = "bubble-sort[recursive]";

    public static Result<int[]> sort(int[] source) {
        var start = System.currentTimeMillis();
        sort(source, source.length);
        var end = System.currentTimeMillis();

        return new Result<>(NAME, source, end - start);
    }

    private static void sort(int[] source, int end) {
        var isSorted = true;

        for (var i = 1; i < end; i++) {
            if (source[i - 1] > source[i]) {
                isSorted = false;
                ArrayUtils.swap(source, i - 1, i);
            }
        }
        if (!isSorted) {
            sort(source, end - 1);
        }
    }
}
