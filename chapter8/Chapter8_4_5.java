package chapter8;

import java.util.Arrays;
import java.math.*;


public class Chapter8_4_5 {

	public static void main (String[] args) {
		//When you make an assignment to an array variable, it simply
		//copies the reference. **It does not** copy the array itself!
		
		double[] a = new double[3];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = Math.pow(i, 10);
		}
		printArray(a);
		
		double[] b = a;
		printArray(b);
		
		//a and b are different names for the same thing (aka: an alias)
		a[1] = 17.0;
		System.out.println(b[1]);
		
		//if you want to make a copy, you need to copy the contents of a
		//into a new array b:
		double[] c = new double[a.length];
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i];
		}
		printArray(c);
		
		//alternatively:
		double[] d = Arrays.copyOf(a, a.length);
		printArray(d);
		
		
	}
	public static void printArray(double[] a) {
		System.out.println(Arrays.toString(a));
	}
	
}
