package chapter4;

public class Exercise4_1 {
	/**  Output from 4.1.1
	No, I wug.
	You wugga wug.
	I wug.
	 */

	/** 4.2.3; you get stuck in an infinite loop?
	 */

	public static void zoop() {
		baffle();
		System.out.print("You wugga ");
		baffle();
	}
	public static void main(String[] args) {
		System.out.print("No, I ");
		zoop();
		System.out.print("I ");
		baffle();
	}
	public static void baffle() {
		System.out.print("wug");
		ping();
	}
	public static void ping() {
		System.out.println(".");
	}
}


