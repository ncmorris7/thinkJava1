package chapter8;

import java.util.Arrays;

public class Chapter8_1_2_3 {

	public static void main(String[] args) {
		int[] counts; 
		double[] values;
		int size = 10;
		
		counts = new int[4];
		values = new double[size];
		
		//it is important to recognize count as a *reference* to the array.
		//The array itself and the variable that refers to it are separate 
		//things and should be thought of accordingly.
		
		//Chapter 8_2: Accessing elements
		
		System.out.println("The zero'th element is " + counts[0]);
		
		counts[0] = 7;
		counts[1] = counts[0] * 2;
		counts[2]++;
		counts[3] -= 60;
		
		//Chapter 8_3: Displaying arrays
		
		//for-loop:
//		for (int i = 0; i < counts.length; i++) {
//			System.out.println(counts[i]);
//		}	
		
		//for:each loop
//		for(int count: counts) {
//			System.out.println(count);
//		}
		
		//while loop:
//		int i = 0; //loop variable
//		while (i<counts.length) {
//			System.out.println(counts[i]);
//			i++;
//		}
		
		printArray(counts);
		//...or:
		System.out.println(Arrays.toString(counts));
	}
	
	//Creating our own printArray method:
	public static void printArray(int[] a) {
		System.out.print("{"+a[0]);
		for (int i = 1; i<a.length; i++) {
			System.out.print(", " + a[i]);
		}
		System.out.println("}");
	}
}
