package chapter5;

import algs4.StdIn;
import algs4.StdOut;

public class Chapter5_10 {
	//Binary Numbers
	
	public static void main (String[] args) {
		displayBinary(15);
		nLines(5);
		countdown(10);
		nLines(5);
		countdown(3);
	}
	public static void countdown(int n) {
		if (n==0) {
			StdOut.println("Blastoff!");
		}
		else {
			countdown(n-1);	//flipped the order - made the recursive call before
			//printing... and instead of counting down, it counts up. WHY??
			//because it gets all the way down to the base-case before beginning
			//to print; it doesn't hit a print command until it gets to 0; then
			//it prints them out in the most recent to the last; the last call
			//before it hits the print statement is 1, then 2, 3... etc; sheesh
			//that's irritatingly small and crucially important.
			StdOut.println(n);
			
		}
	}
	public static void nLines (int n) {//reworking the "threeLine" method from
		//Section 4.3
		if (n>0) {
			StdOut.println(); //Total number of newlines is 1+(n-1), aka: n
			nLines(n-1);
		}
	}
	public static void displayBinary(int value) {
		if (value>0) {
			displayBinary(value/2);
			StdOut.print(value%2);//this is another one of those, "be careful
			//where you put the print vs. recursive call" (though I suppose they
			//all are, really [existential shrug emoji]. Doing the division by 
			//two and then outputting the remainder as a way to get the binary
			//value requires printing the last digit (the smallest value/2) as
			//the first digit in the binary representation. Don't forget that
			//in this case you *do not* want to println.
		}
	}
}
