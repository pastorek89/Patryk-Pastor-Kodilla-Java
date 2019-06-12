package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

        ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for (Integer clu: numbers) {
            if ( clu%2 == 0) {
                evenNumbers.add(clu);
            }
        }
        return evenNumbers;
    }
}
