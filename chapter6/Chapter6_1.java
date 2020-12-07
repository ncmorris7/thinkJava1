package chapter6;

import algs4.StdOut;

public class Chapter6_1 {
	//Return Values
	
	public static void main(String[] args) {
		StdOut.println(calculateArea(50));
		StdOut.println(absoluteValue(50));

	}
	public static double calculateArea(double radius) {
		double result = Math.PI*radius*radius;
		return result;
	}
	public static double absoluteValue(double x) {
		if(x<0) {
			return -x;
		}
		else {
			return x;
		}
		//StdOut.println("this line is dead. How sad.");
		//OO! Eclipse ID's this as "Unreachable Code" 
	}

}
