package com.codewars.kata;

import java.util.HashSet;
import java.util.Set;

public class Representation {
    public static int daysRepresented (int [][] trips){
        Set<Integer> daysSet = new HashSet<>();
        for (int i=0; i<trips.length; i++) {
            for (int j=trips[i][0]; j<=trips[i][1]; j++) {
                daysSet.add(j);
            }
        }

        return daysSet.size();
    }
}
