package com.codewars.kata;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class sorter {
    public static List<String> sort(List<String> textbooks) {
//        Comparator<String> myComparator = new Comparator<String>() {
//            @Override
//            public int compare(String s, String t1) {
//                return 0;
//            }
//
//            @Override
//            public boolean equals(Object o) {
//                return false;
//            }
//        };
//        textbooks.sort(myComparator);

        Collections.sort(textbooks, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return 0;
            }
        });
        return textbooks;
    }
}
