package com.codewars.kata;

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {

        int first = (int) Math.pow(n, 2) - (n - 1);
        int sum = first;
        for (int i = 1; i < n; i++) {
            sum += (first + 2 * i);
        }
        return sum;
    }
}
