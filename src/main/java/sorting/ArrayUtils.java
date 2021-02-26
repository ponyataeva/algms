package sorting;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class ArrayUtils {

    public static void swap(int[] source, int i, int j) {
        var tmp = source[i];
        source[i] = source[j];
        source[j] = tmp;
    }
}
