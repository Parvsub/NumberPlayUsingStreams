package com.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class CreationStreams {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 2, 4, 6, 8, 10, 4, 5, 3, 9, 5};
        OptionalInt count = Arrays.stream(array).filter(num-> num%2 ==0).findFirst();
        System.out.println(count);
    }
}
