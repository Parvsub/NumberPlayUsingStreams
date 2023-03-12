package com.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CreationStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8,10,4);
        list.stream().forEach(System.out::println);
    }
}
