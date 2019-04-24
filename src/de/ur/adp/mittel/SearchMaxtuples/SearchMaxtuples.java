package de.ur.adp.mittel.SearchMaxtuples;

import java.util.Random;

public class SearchMaxtuples {

	public static int searchMaxtuples(Random r, int[] numbers) {
		int length = 1;
		int currLength = 1;
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(6) + 1;
		}
		for(int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == numbers[i+1]) {
				currLength++;
			}
			if (numbers[i] != numbers[i + 1]) {
				currLength = 1;
			}
			if (length < currLength) {
				length = currLength;
			}
		}
		return length;
	}

}
