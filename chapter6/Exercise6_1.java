package chapter6;

public class Exercise6_1 {

	public static void main(String[] args) {
		valueMethod(5);
		//System.out.println("boo!")+7;

	}
	public static int valueMethod(int n)
	{
		return n*n;
	}

}
/*
 * 6.1: Nothing? Nothing happens? Am I missing something?
 * 6.2: It returns the following error: 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
 * 		The left-hand side of an assignment must be a variable
 * 		Syntax error on token "+", invalid AssignmentOperator
 * 		
 * 		at chapter6.Exercise6_1.main(Exercise6_1.java:7)
*/
