package de.ur.adp.leicht.BasePowerN;

import java.util.Arrays;

public class Base {

	public static long[] basePowerN(int base, int n) {
		long[] power = new long [n+1];
		for(int i = 0; i < power.length; i++) {
			power[i] = (long) Math.pow(base, i);
		}
		return power;
	}

}
