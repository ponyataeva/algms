package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Result {

    /**
     * Used sorting algorithm
     */
    @EqualsAndHashCode.Include
    private final String algorithmName;

    /**
     * Result data after the sorting
     */
    private final int[] sorted;

    /**
     * The algorithm's time consumption
     */
    private final long executionTime;
}
