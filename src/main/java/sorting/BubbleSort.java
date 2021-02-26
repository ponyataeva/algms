package sorting;

import lombok.NoArgsConstructor;
import model.Result;

/**
 * Bubble sort is a very simple sort. Its execution time
 * in best case scenario O(n) in worst O(n^2).
 * <p>
 * The algorithm runs through the source array and swap
 * the adjacent elements if they're in a wrong order.
 */
@NoArgsConstructor
public final class BubbleSort {

    public static final String NAME = "bubble-sort";

    public static Result sort(int[] source) {
        var start = System.currentTimeMillis();
        var isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (var i = 1; i < source.length; i++) {
                if (source[i - 1] > source[i]) {
                    isSorted = false;

                    ArrayUtils.swap(source, i - 1, i);
                }
            }
        }
        var end = System.currentTimeMillis();

        return new Result(NAME, source, end - start);
    }
}
