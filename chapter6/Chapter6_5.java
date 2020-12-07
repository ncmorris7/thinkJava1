package chapter6;

import algs4.*;

public class Chapter6_5 {
	//Boolean methods
	public static void main(String[] args) {
		
		StdOut.println(isSingleDigit(-6));
		
		boolean bigFlag = !simplifiedIsSingleDigit(17);
		
		int z = 13;
		if(isSingleDigit(z)) {
			StdOut.println("z is small");
		}
		else {
			StdOut.println("z is gigantic");
		}

	}
	public static boolean isSingleDigit(int x) {
		if (x > -10 && x < 10) {
			return true;	
		}
		else {
			return false;
		}
	}
	
	public static boolean simplifiedIsSingleDigit(int x) {
		return x > -10 && x < 10;
	}
}
