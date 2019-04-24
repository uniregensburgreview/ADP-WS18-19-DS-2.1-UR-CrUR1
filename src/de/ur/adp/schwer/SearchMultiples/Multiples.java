package de.ur.adp.schwer.SearchMultiples;

import java.util.Random;

public class Multiples {

    public static int search(Random r, int[] numbers, int sequenceLength) {
        int index = -1;
        int counter = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(6) + 1;
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            index++;
            if (numbers[i] == numbers [i + 1]) {
                counter++;
            }
            if (numbers[i] != numbers[i + 1]) {
                counter = 1;
            }
            if (counter == sequenceLength) {
                index -= (sequenceLength - 2);
                return index;
            }
        }
        return -1;
    }
}