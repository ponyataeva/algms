package com.example.sorting;

import lombok.NoArgsConstructor;
import com.example.model.Result;

/**
 * Inserts the smallest element from unsorted part into
 * a right place in the sorted part.
 */
@NoArgsConstructor
public final class InsertionSort {

    public static final String NAME = "insertion-sort";

    public static Result<int[]> sort(int[] source) {
        var start = System.currentTimeMillis();

        for (var i = 1; i < source.length; i++) {
            var j = i;
            while (j > 0 && source[j - 1] > source[j]) {
                ArrayUtils.swap(source, j - 1, j);
                j--;
            }
        }
        var end = System.currentTimeMillis();

        return new Result<>(NAME, source, end - start);
    }
}
