package com.example.sorting;

import com.example.model.Result;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class MergeSortRecursive {

    public static final String NAME = "merge-sort";

    public static Result<int[]> sort(int[] source) {
        var start = System.currentTimeMillis();
        sort(source, new int[source.length], 0, source.length - 1);
        var end = System.currentTimeMillis();
        return new Result<>(NAME, source, end - start);
    }

    public static void sort(int[] source, int[] tmp, int left, int right) {
        if (right > left) {
            var middle = left + (right - left) / 2;
            sort(source, tmp, left, middle);
            sort(source, tmp, middle + 1, right);
            merge(source, tmp, left, right);
        }
    }

    private static void merge(int[] source, int[] tmp, int leftStart, int rightEnd) {
        var leftEnd = (rightEnd + leftStart) / 2;
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
