package chapter8;

import java.math.*;
import java.util.Arrays;
import chapter8.Chapter8_4_5;

public class Chapter8_6 {

	public static void main(String[] args) {
		double[] a = {1,2,3,4,5};
		for (int i = 0; i < a.length; i++) {
			a[i] = Math.pow(a[i],2.0);
			//traversal: looping through the elements of an array
		}
	}
	//an example of an array "search" function:
	public static int search(double[] a, double target) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				return i;//returns the index of target value
			}
		}
		return -1;
	}
	//other array functions: reduce (aka reduce values in an array to a single value)
	//other examples include max, min, product, quotient, etc etc
	public static double sum(double[] a) {
		double total = 0.0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}
	
}
