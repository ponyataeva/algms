package com.example;

import com.example.model.Result;
import com.example.sorting.*;

import java.util.Arrays;
import java.util.function.Function;

public class SortingRunner {

    public static void main(String[] args) {
        var targetData = DataGenerator.generateData(100000);
        System.out.println("unsorted data: " + Arrays.toString(targetData));

        run(SelectionSort::sort, Arrays.copyOf(targetData, targetData.length), false);
        run(BubbleSort::sort, Arrays.copyOf(targetData, targetData.length), false);
        run(BubbleSortRecursive::sort, Arrays.copyOf(targetData, targetData.length), false);
        run(InsertionSort::sort, Arrays.copyOf(targetData, targetData.length), false);
        run(InsertionSortBinarySearch::sort, Arrays.copyOf(targetData, targetData.length), false);
        run(InsertionSortRecursive::sort, Arrays.copyOf(targetData, targetData.length), false);
        run(MergeSort::sort, Arrays.copyOf(targetData, targetData.length), false);
        run(MergeSortRecursive::sort, Arrays.copyOf(targetData, targetData.length), false);
    }

    public static void run(Function<int[], Result<int[]>> sorting, int[] toSort, boolean printResult) {
        var result = sorting.apply(toSort);
        System.out.println(executionTimeMsg(result));

        if (printResult) {
            System.out.println(sortedArrayMessage(result));
        }
    }

    private static String executionTimeMsg(Result<int[]> result) {
        return String.format("\n%s: execution time: %sms",
                result.getAlgorithmName(),
                result.getExecutionTime());
    }

    private static String sortedArrayMessage(Result<int[]> result) {
        return String.format("%s: sorted array: %s",
                result.getAlgorithmName(),
                Arrays.toString(result.getResult()));
    }
}
