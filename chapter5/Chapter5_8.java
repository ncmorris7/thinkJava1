package chapter5;

import algs4.StdIn;
import algs4.StdOut;
import algs4.Stopwatch;

public class Chapter5_8 {
	//Recursive Methods
	
	public static void main (String[] args) {
		countdown(10);
		nLines(5);
		countdown(3);
	}
	public static void countdown(int n) {
		if (n==0) {
			StdOut.println("Blastoff!");
		}
		else {
			StdOut.println(n);
			countdown(n-1);	//The method invokes itself, aka: is recursive
		}
	}
	public static void nLines (int n) {//reworking the "threeLine" method from
		//Section 4.3
		if (n>0) {
			StdOut.println(); //Total number of newlines is 1+(n-1), aka: n
			nLines(n-1);
		}
	}
}
