package com.codewars.kata;

import java.util.ArrayList;
import java.util.List;

public class Beggars {
    public static int[] beggars(int[] values, int n) {

        List<Integer> beggarsList = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=0; j<values.length; j++) {
                if (j%n == i) {
                    sum += values[j];
                }
            }
           beggarsList.add(sum);
        }

        return beggarsList
                .stream()
                .mapToInt(i -> i)
                .toArray();
    }
}