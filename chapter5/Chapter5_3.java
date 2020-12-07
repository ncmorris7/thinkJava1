package chapter5;

public class Chapter5_3 {

	public static void isPositive (int x) {
		//Execute conditional statement
		if (x>0) 
			System.out.println("x is positive");
			System.out.println("x is not zero"); 
			//Demonstrating that in an if statement, only the first println
			//in this example would be seen by the compiler; the second prints
			//regardless
	}
	public static void isOddOrEven (int x) {
		
		//If the integer is even, print "is even," otherwise, print "is odd"
		if (x%2==0) {
			System.out.println("x is even");
		}
		else {
			System.out.println("x is odd");
		}
	}
	public static void main(String[] args) {
		//Declare variables
		int x = -5;
		
		//Call methods
		isPositive(x);
		isOddOrEven(x);
	}

}
