package chapter7;

import java.util.Scanner;

public class Chapter7_7 {

	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
//		while (true) {
//			System.out.print("Enter a number: ");
//			if (in.hasNextDouble()) {
//				break;
//			}
//			String word = in.next();
//			System.err.println(word+ " is not a number");
//		}
//		double x = in.nextDouble();
//		
		
		int x = -1;
		int sum = 0;
		
		while (x != 0) {
			x = in.nextInt();
			if (x <= 0) {
				continue;
			}
			System.out.println("Adding " + x);
			sum += x;
		}
		System.out.println(sum);
		
		in.close();
	}
}
