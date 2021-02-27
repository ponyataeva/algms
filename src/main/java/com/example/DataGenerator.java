package com.example;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Random;
import java.util.stream.IntStream;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DataGenerator {

    public static int[] generateData(int size) {
        return new Random().ints(0, 100)
                .limit(size)
                .toArray();
    }

    public static int[] generateSortedData(int size) {
        return IntStream.rangeClosed(0, size).toArray();
    }
}
