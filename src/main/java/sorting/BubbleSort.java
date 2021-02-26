package sorting;

import lombok.NoArgsConstructor;
import model.Result;

@NoArgsConstructor
public final class BubbleSort {

    public static final String NAME = "bubble-sort";

    public static Result sort(int[] source) {
        var start = System.currentTimeMillis();
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (var i = 1; i < source.length; i++) {
                if (source[i - 1] > source[i]) {
                    isSorted = false;
                    var tmp = source[i - 1];
                    source[i - 1] = source[i];
                    source[i] = tmp;
                }
            }
        }
        var end = System.currentTimeMillis();

        return new Result(NAME, source, end - start);
    }
}
