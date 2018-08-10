package com.codewars.kata;

import java.util.Arrays;

public class Pentanacci {
    public static long countOddPentaFib(long n) {

        long[] numbers = Arrays.copyOf(new long[]{0L,1L,1L,2L,4L}, (int)n+1);

        for (int i=5; i<=n; i++) {
            numbers[i] = Arrays.stream(Arrays.copyOfRange(numbers, i-5, i)).sum();
        }
//        long[] oddNumbers = Arrays.stream(numbers).filter(s -> s%2 != 0).distinct().toArray();
        return Arrays.stream(numbers)
                .filter(s -> s%2 != 0).distinct()
                .toArray()
                .length;
    }
}
