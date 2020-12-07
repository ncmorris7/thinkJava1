package chapter6;

public class Exercise6_5 {

/*
 * Expected output:
 * ping!
 * pong!
 * 
 * ah; damn; didn't look closely enough at the system outs in main; both
 * statements were true, and would produce "ping!" and "pong!" but it
 * also asks for the values of the flags to be printed, which are both
 * true. Gotta read more carefully...
 */
	public static void main (String[] args)
	{
		boolean flag1 = isHoopy(202);
		boolean flag2 = isFrabjuous(202);
		System.out.println(flag1);
		System.out.println(flag2);
		if (flag1 && flag2) {
			System.out.println("ping!");
		}
		if (flag1 || flag2) {
			System.out.println("pong!");
		}
	}

	public static boolean isHoopy(int x) {
		boolean hoopyFlag;
		if (x % 2 == 0) {
			hoopyFlag = true;
		} else {
			hoopyFlag = false;
		}
		return hoopyFlag;
	}
	public static boolean isFrabjuous(int x) {
		boolean frabjuousFlag;
		if (x > 0) {
			frabjuousFlag = true;
		} else {
			frabjuousFlag = false;
		}
		return frabjuousFlag;
	}
}
