package chapter8;

import java.util.Arrays;
import java.util.Random;


public class Chapter8_7 {

	public static void main (String[] args) {
		int numValues = 8;
		int[] array = randomArray(numValues);
		printArray(array);
	}
	
	public static int[] randomArray(int size) {
		Random random = new Random();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}
		return a;
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
