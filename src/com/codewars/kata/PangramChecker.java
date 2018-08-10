package com.codewars.kata;

import java.util.List;
import java.util.stream.Collectors;

public class PangramChecker {
    public static boolean check(String sentence){
        List<Character> alphabet = "abcdefghijklmnopqrstuvwxyz"
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        alphabet.removeIf(c -> sentence.toLowerCase().contains(c.toString()));
        if (alphabet.isEmpty()) {
            return true;
        }
        return false;
    }
}

