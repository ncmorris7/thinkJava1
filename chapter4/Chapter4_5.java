package chapter4;

public class Chapter4_5 {

	public static void printTwice(String s) {
		//Format output
		System.out.println(s);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		//Declare variables
		String argument = "Don't make me say this twice, you miserable little monster!";
		
		//Process and output
		printTwice(argument);

	}

}
