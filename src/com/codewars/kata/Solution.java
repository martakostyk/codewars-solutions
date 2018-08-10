package com.codewars.kata;
import java.util.List;

public class Solution {
    public static <T> T last(final List<T> list) {
        return list.get(list.size()-1);
    }
    public static char last(final String string) {
        return string.charAt(string.length()-1);
    }
    public static <T> T last(final T... list) {
        T listItem = list[0];
        for (int i=1; i<list.length; i++) {
            listItem = list[i];
        }
        return listItem;
    }


}