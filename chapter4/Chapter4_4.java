package chapter4;

public class Chapter4_4 {
	
	public static void newLine() {
		//Format output
		System.out.println();
	}
	
	public static void threeLines() {
		//Format output
		newLine();
		newLine();
		newLine();
	}
	public static void main(String[] args) {
		//Format output
		System.out.println("First line.");
		threeLines();
		System.out.println("Second line.");
	}

}
