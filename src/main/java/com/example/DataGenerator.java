package com.example;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Random;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DataGenerator {

    public static int[] generateData(int size) {
        return new Random().ints(0, 100)
                .limit(size)
                .toArray();
    }
}
