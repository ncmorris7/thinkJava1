package chapter5;

public class Chapter5_4 {
	//Chaining and nesting
	
	public static void option1 (int x) {
		//Conditionals with statements and braces lined up
		if (x>0) {
			System.out.println("x is positive.");
		}
		else if (x<0) {
			System.out.println("x is negative");
		}
		else {
			System.out.println("x is 0");
		}
	}
	public static void option2(int x) {
		//Nested conditionals
		if (x==0) {
			System.out.println("Option 2 says 'x is zero'");
		}
		else {
			if(x>0) {
				System.out.println("Option 2 says 'x is positive'");
			}
			else {
				System.out.println("Option 2 says 'x is negative'");
			}
		}
	}
	
	public static void main(String[] args) {
		option1(5);
		option1(0);
		option1(-5);
		System.out.println();
		option2(5);
		option2(0);
		option2(-5);
	}
	

}
