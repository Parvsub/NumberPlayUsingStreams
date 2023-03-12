package com.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreationStreams {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics result = primes.stream()
                .mapToInt((x) -> x).summaryStatistics();
        System.out.print(result);
    }
}
