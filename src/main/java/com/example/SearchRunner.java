package com.example;

import com.example.model.Result;
import com.example.searching.BinarySearch;
import com.example.searching.BinarySearchRecursive;

import java.util.function.BiFunction;

public class SearchRunner {

    public static void main(String[] args) {
        var data = DataGenerator.generateSortedData(Integer.MAX_VALUE / 100);

        run(BinarySearch::search, data, 394852);
        run(BinarySearchRecursive::search, data, 394852);
    }

    private static void run(BiFunction<int[], Integer, Result<Integer>> search, int[] searchIn, int element) {
        var result = search.apply(searchIn, element);
        System.out.println(executionTimeMsg(result));
    }

    private static String executionTimeMsg(Result<Integer> result) {
        return String.format("\n%s: execution time: %sms",
                result.getAlgorithmName(),
                result.getExecutionTime());
    }
}
