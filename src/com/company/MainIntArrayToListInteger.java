package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainIntArrayToListInteger {

    public static void main(String[] args) {
        int[] states = {100, 999, 0, -1, 2, 3, 1, 11};
        Arrays.sort(states);

        List<Integer> list = Arrays.stream(states)
                .peek(e -> System.out.printf("e: %s class: int\n", e))
                .boxed()
                .peek(e -> System.out.printf("e: %s class: %s\n", e, e.getClass().getName()))
                .collect(Collectors.toList());

        Integer result = list.stream().reduce(0, Integer::sum);
        System.out.printf("sum: %s\n", result);

        System.out.printf("list: %s\n", list);

        List<Integer> s = Stream.of("1", "2")
                .map(Integer::valueOf)
                .peek(e -> System.out.printf("e: %s class: %s\n", e, e.getClass().getName()))
                .collect(Collectors.toList());
        System.out.printf("list: %s\n", s);
    }
}
