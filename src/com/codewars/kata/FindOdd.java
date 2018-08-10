package com.codewars.kata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] a) {
        List<Integer> list = Arrays.stream(a)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);

        List<Integer> listSorted = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listSorted);

        for (Integer num: listSorted) {
            int subtraction = list.lastIndexOf(num)-list.indexOf(num);
            if (subtraction > 1 && subtraction%2 == 0) return num;
        }
        return 0;
    }
}