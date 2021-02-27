package com.example.searching;

import com.example.model.Result;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class BinarySearch {

    public static final String NAME = "binary-search";

    public static Result<Integer> binarySearch(int[] source, int target) {
        var start = System.currentTimeMillis();
        var result = perform(source, target);
        var end = System.currentTimeMillis();

        return new Result<>(NAME, result, end - start);
    }

    private static int perform(int[] source, int target) {
        int left = 0, right = source.length - 1;

        while (left <= right) {
            var middle = left + (right - left) / 2;

            if (source[middle] == target) {
                return middle;
            } else if (source[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
