package chapter6;

import algs4.StdOut;

public class Chapter6_2 {
	//Writing Methods
	
	public static void main(String[] args) {
		StdOut.println(distance(1,2,4,6));

	}
	public static double distance(double x1, double y1, double x2, double y2) {
		//Declare variables
		double xDist, yDist, xSquared, ySquared, toBeRooted, result;
		
		//Intermediate, scaffolding steps
		xDist = x2-x1;
		yDist = y2-y1;
		xSquared = xDist*xDist;
		ySquared = yDist*yDist;
		toBeRooted = xSquared + ySquared;
		result = Math.sqrt(toBeRooted);
		
		//Return values
		//return 0.0 //scaffolding!
		return result;
		
		//This was my version of it; it's similar enough.
		//The concept of returning 0.0 was new to me.
	}

}
