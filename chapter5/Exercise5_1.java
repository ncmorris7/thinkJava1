package chapter5;

import algs4.StdOut;

public class Exercise5_1 {

	public static void main(String[] args) {
		int x = -1;
		if (x>0 && x<10) {
			StdOut.printf("%d is a positive, single digit number.",x);
		}
		else {
			System.err.printf("%d is not a positive, single digit number", x);
		}

	}

}
