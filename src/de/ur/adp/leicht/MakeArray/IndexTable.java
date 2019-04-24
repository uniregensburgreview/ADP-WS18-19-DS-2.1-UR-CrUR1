package de.ur.adp.leicht.MakeArray;

public class IndexTable {

	private static String[][] index;

	public static String[][] makeArray(int n) {
		index = new String[n][n];
		for(int x = 0; x < index.length; x++) {
			for(int y = 0; y < index.length; y++) {
				String indexString =  "[" + x + "," + y + "]";
				index[x][y] = indexString;
			}
		}
		return index;
	}
	
}
