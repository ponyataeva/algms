import model.Result;
import sorting.SelectionSort;

import java.util.Arrays;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        var targetData = DataGenerator.generateData(10);
        System.out.println("unsorted data: " + Arrays.toString(targetData));

        run(SelectionSort::sort, Arrays.copyOf(targetData, targetData.length), true);
    }

    public static void run(Function<int[], Result> sorting, int[] toSort, boolean printResult) {
        var result = sorting.apply(toSort);
        System.out.println(executionTimeMsg(result));

        if (printResult) {
            System.out.println(sortedArrayMessage(result));
        }
    }

    private static String executionTimeMsg(Result result) {
        return String.format("%s: execution time: %ss",
                result.getAlgorithmName(),
                result.getExecutionTime() / 1000);
    }

    private static String sortedArrayMessage(Result result) {
        return String.format("%s: sorted array: %s",
                result.getAlgorithmName(),
                Arrays.toString(result.getSorted()));
    }
}
