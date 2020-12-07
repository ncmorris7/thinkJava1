package chapter5;
import java.util.Scanner;

import algs4.StdIn;
import algs4.StdOut;


public class Chapter5_7 {
	//Validating input
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		scanDouble(in);

	}
	public static void scanDouble(Scanner in) {
		StdOut.println("Enter a number: ");
		if(!in.hasNextDouble()) { // "Checks whether the next token in the input
			//stream can be interpreted as a double. If so, we can call 
			//nextDouble with no chance of throwing an exception. If not we
			//display the following error message" TJ p. 74
			String word = in.next();
			System.err.println(word + " is not a number");
			return;
		}
		double x = in.nextDouble();
		printLogarithm(x);
	}

	public static void printLogarithm(double x) {
		if (x<=0.0) {
			System.err.println("Error: x must be positive.");
			//in the case of an error (all logarithms must be positive)
			//"The flow of execution immediately returns to where the method was
			//invoked, and the remaining lines of the method are not executed"
			//Think Java, p. 73
		}
		double result = Math.log(x);
		StdOut.printf("The log of %.0f is %.5f\n",x,result);
	}
}
