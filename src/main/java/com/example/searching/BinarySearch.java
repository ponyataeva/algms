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
        int increment = deleteAndRound(source.length - 1);
        int index = increment;

        if (target < source[0]) {
            return -1;
        } else if (target > source[source.length - 1]) {
            return -1;
        }
        else if (target == source[0]) {
            return 0;
        } else if (target == source[source.length - 1]) {
            return source.length - 1;
        }
        while (increment > 0) {
            if (source[index] == target) {
                return index;
            } else if (source[index] > target) {
                increment = deleteAndRound(increment);
                index -= increment;
            } else if (source[index] < target) {
                increment = deleteAndRound(increment);
                index += increment;
            }
        }
        return -1;
    }

    private static int deleteAndRound(int value) {
        return value == 1 ? 0 : (value + 2 - 1) / 2;
    }
}
