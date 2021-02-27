package com.example.searching;

import com.example.model.Result;

public class BinarySearchRecursive {

    public static final String NAME = "binary-search[recursive]";

    public static Result<Integer> search(int[] source, int target) {
        var start = System.currentTimeMillis();
        var result = search(source, 0, source.length - 1, target);
        var end = System.currentTimeMillis();

        return new Result<>(NAME, result, end - start);
    }

    public static int search(int[] source, int left, int right, int target) {
        if (left <= right) {
            var middle = left + (right - left) / 2;

            if (source[middle] == target) {
                return middle;
            } else if (source[middle] < target) {
                return search(source, middle + 1, right, target);
            } else {
                return search(source, left, middle - 1, target);
            }
        } else {
            return -1;
        }
    }
}
