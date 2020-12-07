package chapter5;

public class Exercise5_2 {

	/**
	 * Yuck to this:
	 * 
	 * just for
	 * any not more
	 * It's breakfast! **<< I had the exclamation point here; it
	 * should be on a newline>>**
	 */
	public static void zoop(String fred, int bob) {
		System.out.println(fred);
		if (bob == 5) {
			ping("not ");
		} else {
			System.out.println("!");
		}
	}
	public static void main(String[] args) {
		int bizz = 5;
		int buzz = 2;
		zoop("just for", bizz);
		clink(2 * buzz);
	}
	public static void clink(int fork) {
		System.out.print("It's ");
		zoop("breakfast ", fork);
	}
	public static void ping(String strangStrung) {
		System.out.println("any " + strangStrung + "more ");
	}
}
