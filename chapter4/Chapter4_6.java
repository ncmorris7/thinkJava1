package chapter4;

public class Chapter4_6 {

	public static void printTime(int hour, int minute) {
		//Format output
		System.out.print(hour);
		System.out.print(":");
		System.out.println(minute);
	}
	public static void main(String[] args) {
		//Declare variables
		int banana = 11;
		int carbonara = 59;
		
		//Process and output
		printTime(banana+1, carbonara);
	}
}
