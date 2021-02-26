package sorting;

import lombok.NoArgsConstructor;
import model.Result;

/**
 * The selection sort algorithm sorts an array by repeatedly finding
 * the minimum element (considering ascending order)
 * from unsorted part and putting it at the beginning.
 * <p>
 * Time complexity: O(n^2)
 */
@NoArgsConstructor
public final class SelectionSort {

    public static final String NAME = "selection-sort";

    public static Result sort(int[] source) {
        var start = System.currentTimeMillis();

        var sourceSize = source.length;
        int minimumValue;
        int minPosition;

        for (var i = 0; i < sourceSize; i++) {
            minimumValue = source[i];
            minPosition = i;
            for (var j = i; j < sourceSize; j++) {
                if (source[j] < minimumValue) {
                    minimumValue = source[j];
                    minPosition = j;
                }
            }

            ArrayUtils.swap(source, minPosition, i);
        }
        var end = System.currentTimeMillis();

        return new Result(NAME, source, end - start);
    }
}
