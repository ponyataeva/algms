package sorting;

import lombok.NoArgsConstructor;
import model.Result;

@NoArgsConstructor
public final class SelectionSort {

    public static final String NAME = "selection-sort";

    public static Result sort(int[] source) {
        var sourceSize = source.length;
        int minimumValue;
        int minPosition;

        var start = System.currentTimeMillis();
        for (var i = 0; i < sourceSize; i++) {
            minimumValue = source[i];
            minPosition = i;
            for (var j = i; j < sourceSize; j++) {
                if (source[j] < minimumValue) {
                    minimumValue = source[j];
                    minPosition = j;
                }
            }
            var tmp = source[i];
            source[i] = minimumValue;
            source[minPosition] = tmp;
        }
        var end = System.currentTimeMillis();

        return new Result(NAME, source, end - start);
    }
}
