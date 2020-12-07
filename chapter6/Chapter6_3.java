package chapter6;

import algs4.StdOut;
import chapter6.Chapter6_2;
import chapter6.Chapter6_1;

public class Chapter6_3 {
	//Method Composition
	
	public static void main(String[] args) {
		StdOut.println(circleArea(1,2,4,6));
	}
	public static double circleArea(double xc, double yc, double xp, double yp) {
		double radius = Chapter6_2.distance(xc, yc, xp, yp);
//		StdOut.println(radius); //Sanity Check
		double area = Chapter6_1.calculateArea(radius);
		return Chapter6_1.calculateArea(Chapter6_2.distance(xc, yc, xp, yp));
	}
	
}
