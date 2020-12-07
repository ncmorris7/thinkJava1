package chapter7;

public class Exercise7_1 {

	
	public static void main (String[] args) {
		loop(10);
	}
	
	public static void loop(int n) {
		int i = n;
		while (i>1) {
//			System.out.println(i);
			if (i %2 == 0) {
				i = i/2;
			}
			else {
				i = i + 1;
			}
			System.out.printf("%d, %d\n",i, n);
		}
	}
}

//1. values of i and n:
//Start: 10 and 10
//end of loop 1: 5 and 10
//end of loop 2: 6 and 10
//end of loop 3: 3 and 10
//end of loop 4: 4 and 10
//end of loop 5: 2 and 10
//end of loop 6: 1 and 10
