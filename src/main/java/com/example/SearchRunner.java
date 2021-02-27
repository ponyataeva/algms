package com.example;

import com.example.searching.BinarySearch;

public class SearchRunner {

    public static void main(String[] args) {
        var data = DataGenerator.generateSortedData(Integer.MAX_VALUE / 100);
        var result = BinarySearch.binarySearch(data, 23442);

        System.out.println("position: " + result.getResult());
        System.out.println("execution time: " + result.getExecutionTime() + "s");
    }
}
