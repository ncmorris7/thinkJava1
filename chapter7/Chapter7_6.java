package chapter7;
import java.util.*;
public class Chapter7_6 {
	//a test of the do-while statement; "posttest loops"
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		boolean okay; //a "flag" variable
		do {
			System.out.print("Enter a number: ");
			if (in.hasNextDouble()) {
				okay = true;
			}
			else {
				okay = false;
				String word = in.next(); //if hasNextDouble returns false, we consume the
				//invalid input by calling next(); then display an error message
				System.err.println(word+ " is not a number.");
			}
		}
		while(!okay);
		double x = in.nextDouble();

		in.close();
	}
}
