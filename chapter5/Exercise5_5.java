package chapter5;

import algs4.StdOut;

public class Exercise5_5 {

	public static void main(String[] args) {
		bottles(99);

	}
	public static void bottles(int n) {
		if (n==0) {
			StdOut.println("No bottles of beer on the wall,\nno bottles of beer,"
					+ "\nya' can't take one down, ya' can't pass it around,\n"
					+ "'cause there are no more bottles of beer on the wall!");
		}
		else {
		StdOut.printf("%d bottles of beer on the wall,\n%d bottles of beer,\n"
				+ "ya' take one down, ya' pass it around,\n%d bottles of beer"
				+ " on the wall\n\n", n,n,n-1);
		bottles(n-1);
		}
	}

}
