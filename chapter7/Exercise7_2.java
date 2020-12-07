package chapter7;

import java.math.*;

public class Exercise7_2 {

	public static void main (String[] args) {
		double toTest = 300024828;
		double answer = squareRoot(toTest);
		System.out.printf("Answer found via Math.sqrt():\t%f\nAnswer found via squareRoot:\t%f\n",Math.sqrt(toTest),answer);
		System.out.printf("Difference: %f", Math.abs(Math.sqrt(toTest) - answer));
	}
	
	public static double squareRoot(double n) {
		double prev = n/2;
		double guess = (prev + (n/prev))/2;
		
		boolean okay;
		while ((Math.abs(guess-prev))>.0001) {
				prev = guess;
				guess = (prev + (n/prev))/2;
				//System.out.printf("%f, %f\n", n, prev);
		}	
		return guess;
	}
}
