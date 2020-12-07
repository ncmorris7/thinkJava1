package chapter5;

import algs4.StdOut;

public class Chapter5_6 {
	//The return statement
	public static void main(String[] args) {
		printLogarithm(-2);
		printLogarithm(12);
	}
	
	public static void printLogarithm(double x) {
		if (x<=0.0) {
			System.err.println("Error: x must be positive.");
			return; //in the case of an error (all logarithms must be positive)
			//"The flow of execution immediately returns to where the method was
			//invoked, and the remaining lines of the method are not executed"
			//Think Java, p. 73
		}
		double result = Math.log(x);
		StdOut.println("The log of x is "+result);
	}
}
