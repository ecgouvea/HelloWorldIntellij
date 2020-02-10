package com.company;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MainDoubleStatistics {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        DoubleSummaryStatistics stats = integerList.stream()
                .mapToDouble(Double::valueOf)
                .summaryStatistics();

        System.out.println("\nmapToDouble");
        System.out.printf("Average: %s\n", stats.getAverage());
        System.out.printf("Count: %s\n", stats.getCount());
        System.out.printf("Max: %s\n", stats.getMax());
        System.out.printf("Min: %s\n", stats.getMin());
        System.out.printf("Sum: %s\n", stats.getSum());

        stats = integerList.stream()
                .collect(Collectors.summarizingDouble(e -> e));

        System.out.println("\nCollectors.summarizingDouble");
        System.out.printf("Average: %s\n", stats.getAverage());
        System.out.printf("Count: %s\n", stats.getCount());
        System.out.printf("Max: %s\n", stats.getMax());
        System.out.printf("Min: %s\n", stats.getMin());
        System.out.printf("Sum: %s\n", stats.getSum());
    }
}
