package com.codewars.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BingoCard {
    public static String[] getCard() {

        String bingo = "BINGO";
        List<String[]> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int addition = 15 * i;
            int limit = 5;
            if (i == 2) {
                limit =4;
            }
            String letter = String.valueOf((bingo.charAt(i)));
            numbers.add(new Random()
                    .ints(1, 15)
                    .distinct()
                    .limit(limit)
                    .boxed()
                    .map(num -> letter + (num + addition))
                    .toArray(String[]::new)
            );
        }
        return numbers.stream().flatMap(Arrays::stream).toArray(String[]::new);
    }
}
