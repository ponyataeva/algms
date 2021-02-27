package com.example.sorting;

import com.example.model.Result;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class InsertionSortRecursive {

    public static final String NAME = "insertion-sort[recursive]";

    public static Result<int[]> sort(int[] source) {
        var start = System.currentTimeMillis();

        for (var i = 1; i < source.length; i++) {
            swap(source, i);
        }
        var end = System.currentTimeMillis();

        return new Result<>(NAME, source, end - start);
    }

    private static void swap(int[] source, int position) {
        if (position > 0 && source[position - 1] > source[position]) {
            ArrayUtils.swap(source, position - 1, position);

            swap(source, --position);
        }
    }
}
