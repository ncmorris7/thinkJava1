package chapter5;

import java.util.Scanner;
import java.util.Random;
import java.math.*;
import algs4.StdOut;

public class Exercise5_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		guessInt(in);
		
		
	}
	public static void guessInt(Scanner in) {
		int randoVal, guess;
		Random random = new Random();
		randoVal = random.nextInt(100)+1;
		
		//Gather input (Is randoVal technically input?)
		
		System.out.println("I'm thinking of a number between 1 and 100, "
				+ "inclusive.\nCan you guess that number?\nType a number: ");
		guess = in.nextInt();
	
		if (guess!=randoVal) {
		//Process and output
		System.out.printf("Your terrible guess was: %d."
				+ "\nThe brilliant number I was thinking of is: %d."
				+ "\nYou were off by the embarrassingly large number: %d.\n"
				,guess,randoVal,Math.abs(randoVal-guess));
		if(guess-randoVal>0) { //conditional to match guess to randoVal and
			//provide feedback that the guess was too high or too low.
			//Aka, if it's greater than zero, the guess was too high, and if
			//it's less than zero the guess was too low. This much explanation
			//is probably uncalled for.
			StdOut.println("Your guess was too high! Try again!\n");
		}
		else {
			StdOut.println("Your guess was too low! Try again!\n");
		}
		guessInt(in);
		
		
				//Technically, the absolute value was not a requirement, 
				//but it seemed like a necessary/useful wrinkle 
		}
		else {
			StdOut.println("You nailed it!");
		}
	}

}
