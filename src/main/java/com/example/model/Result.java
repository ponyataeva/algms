package com.example.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Result<T> {

    /**
     * Used com.example.sorting algorithm
     */
    @EqualsAndHashCode.Include
    private final String algorithmName;

    /**
     * Result data after the algorithm execution
     */
    private final T result;

    /**
     * The algorithm's time consumption
     */
    private final long executionTime;
}
