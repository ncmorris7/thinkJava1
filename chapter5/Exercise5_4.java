package chapter5;

import algs4.StdOut;
import java.math.*;

public class Exercise5_4 {

	public static void main(String[] args) {
		StdOut.println("Fermat's Last Theorem says that there are no integers\n"
				+ "a, b, and c, such that a^n + b^n = c^n, except when n<2.\n");
		checkFermat(6, 5, 4, 3);
	}
	public static void checkFermat(int a, int b, int c, int n) {
		double aToN = Math.pow(a, n);
		double bToN = Math.pow(b, n);
		double cToN = Math.pow(c, n);
		StdOut.printf("a = %d, b = %d, c = %d, and n = %d\n",a,b,c,n);
		StdOut.printf("a to n = %.0f, \nb to n = %.0f,\nc to n = %.0f.\n\n", aToN, bToN, cToN);
		StdOut.printf("(a to n) + (b to n) = %.0f\n\n", (aToN+bToN));
		if (n>2 && (aToN +bToN == cToN)) {
			StdOut.println("Holy smokes, Fermat was wrong!");
		}
		else {
			StdOut.println("Those numbers don't work. Dead, dead Fermat is still "
					+ "right.");
		}
	}

}
