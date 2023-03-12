package com.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreationStreams {
    public static void main(String[] args) {
        Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9,56).filter(num->num%2==0)
                .max(Comparator.comparing(Integer::valueOf)).filter(num->num%2==0).get();
        System.out.println(maxNumber);

        Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(num->num%2==0)
                .min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(minNumber);
    }
}
