package com.codewars.kata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {

        Set<String> set3 = new HashSet<>();

        for (String w1 : array1) {
            for (String w2 : array2) {
                if (w2.contains(w1)) {
                    set3.add(w1);
                    break;
                }
            }
        }

        String[] array3 = set3.toArray(new String[set3.size()]);
        Arrays.sort(array3);
        return array3;
    }
}
