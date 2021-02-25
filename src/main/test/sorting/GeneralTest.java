package sorting;

import lombok.RequiredArgsConstructor;
import model.Result;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

@RequiredArgsConstructor
abstract class GeneralTest {

    private final Function<int[], Result> soringFunction;

    @Test
    void sort_whenEmptyArray_thenDoNotThrowError() {
        assertDoesNotThrow(() -> soringFunction.apply(new int[0]));
    }

    @Test
    void sort_whenOneElement_thenReturnIt() {
        var expected = new int[]{0};
        var target = new int[]{0};

        var actual = soringFunction.apply(target);

        assertTrue(Arrays.equals(expected, actual.getSorted()));
    }

    @Test
    void sort_whenNotSortedArray_thenSortAndReturn() {
        var expected = new int[]{2, 3, 5, 10, 15, 20};
        var target = new int[]{20, 15, 10, 5, 3, 2};

        var actual = soringFunction.apply(target);

        assertTrue(Arrays.equals(expected, actual.getSorted()));
    }

}