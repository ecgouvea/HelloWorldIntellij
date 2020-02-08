package com.company;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello!");

        Stream.of(1,2,3,4)
                .forEach(e -> {
                    System.out.printf("%d in thread %s\n", e, Thread.currentThread().getName());
                });
    }
}
