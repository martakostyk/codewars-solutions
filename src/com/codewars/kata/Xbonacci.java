package com.codewars.kata;

import java.util.Arrays;

public class Xbonacci {

    public static double[] xbonacci(double[] signature, int n) {

        double[] xbonacci = Arrays.copyOf(signature, n);
        for (int i=signature.length; i<n; i++) {
            xbonacci[i] = Arrays.stream(Arrays.copyOfRange(xbonacci, i-signature.length, i)).sum();
        }
        return xbonacci;
    }
}
