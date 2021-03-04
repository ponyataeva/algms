package com.example.sorting;

import com.example.model.Result;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class MergeSort {
    public static final String NAME = "merge-sort";

    public static Result<int[]> sort(int[] source) {
        var start = System.currentTimeMillis();
        sort(source, new int[source.length]);
        var end = System.currentTimeMillis();
        return new Result<>(NAME, source, end - start);
    }

    public static void sort(int[] source, int[] tmp) {
        var size = source.length;

        for (var step = 1; step < size; step = 2 * step) {
            for (var leftStart = 0; leftStart < size - 1; leftStart += 2 * step) {

                var rightEnd = Math.min(leftStart + 2 * step - 1, size - 1);
                var leftEnd = Math.min(leftStart + step - 1, size - 1);

                merge(source, tmp, leftStart, leftEnd, rightEnd);
            }
        }
    }

    private static void merge(int[] source, int[] tmp, int leftStart, int leftEnd, int rightEnd) {
        var rIndex = leftEnd + 1;
        var lIndex = leftStart;
        var index = leftStart;

        while (lIndex <= leftEnd && rIndex <= rightEnd) {
            if (source[lIndex] > source[rIndex]) {
                tmp[index] = source[rIndex];
                rIndex++;
            } else {
                tmp[index] = source[lIndex];
                lIndex++;
            }
            index++;
        }

        while (lIndex <= leftEnd) {
            tmp[index] = source[lIndex];
            lIndex++;
            index++;
        }
        while (rIndex <= rightEnd) {
            tmp[index] = source[rIndex];
            rIndex++;
            index++;
        }

        var copySize = rightEnd + 1;
        while (leftStart < copySize) {
            source[leftStart] = tmp[leftStart];
            leftStart++;
        }
    }
}
