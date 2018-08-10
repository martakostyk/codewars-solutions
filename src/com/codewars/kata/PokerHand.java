package com.codewars.kata;

import java.util.ArrayList;

public final class PokerHand {
    public static boolean IsStraight(ArrayList<Integer> cards) {
        if (cards.contains(14)) cards.add(1);
        for (int i=1; i<11; i++) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int j=0; j<5; j++) {
                numbers.add(i+j);
            }
            if (cards.containsAll(numbers)) return true;
        }
        return false;
    }
}

//        Collections.sort(cards, (a,b) -> -Integer.compare(b,a));
//            for (int i=0; i<cards.size()-4; i++) {
//                if ( (cards.get(i) == cards.get(i+1) -1) && (cards.get(i) == cards.get(i+2) -2)
//                        && (cards.get(i) == cards.get(i+3) -3) && (cards.get(i) == cards.get(i+4) -4)) {
//                    return true;
//                } else return false;
//            }