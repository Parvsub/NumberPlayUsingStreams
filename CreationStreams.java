package com.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CreationStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8,10,4,5,3,9,5);
        list.stream().filter(n->n % 2 ==0).forEach(System.out::println);
    }
}
