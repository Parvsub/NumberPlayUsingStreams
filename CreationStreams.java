package com.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreationStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        System.out.println("The sorted stream is : ");
        // displaying the stream with elements
        // sorted in natural order
        list.stream().sorted().forEach(System.out::println);
    }
}
    
