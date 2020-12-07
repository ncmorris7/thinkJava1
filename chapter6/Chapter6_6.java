package chapter6;

import algs4.StdOut;

public class Chapter6_6 {
	//Javadoc Tags
	public static void main(String[] args) {

		StdOut.println(isSingleDigit(-6));


		int z = 13;
		if(isSingleDigit(z)) {
			StdOut.println("z is small");
		}
		else {
			StdOut.println("z is gigantic");
		}

	}
/**
 * Tests whether x is a single digit integer
 * 
 * @param x the integer to test
 * @return true if x has one digit, false otherwise
 */
	public static boolean isSingleDigit(int x) {
		if (x > -10 && x < 10) {
			return true;	
		}
		else {
			return false;
		}
	}
}
