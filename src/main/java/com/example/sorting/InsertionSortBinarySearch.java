package com.example.sorting;

import com.example.model.Result;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@NoArgsConstructor
public final class InsertionSortBinarySearch {

    public static final String NAME = "insertion-sort[binary-search]";

    public static Result<int[]> sort(int[] source) {
        var start = System.currentTimeMillis();

        for (var currentPosition = 1; currentPosition < source.length; currentPosition++) {
            var current = source[currentPosition];

            if (source[currentPosition - 1] > current) {
                var newPosition = Math.abs(Arrays.binarySearch(source, 0, currentPosition, current) + 1);
                System.arraycopy(source, newPosition, source, newPosition + 1, currentPosition - newPosition);
                source[newPosition] = current;
            }
        }
        var end = System.currentTimeMillis();

        return new Result<>(NAME, source, end - start);
    }
}
