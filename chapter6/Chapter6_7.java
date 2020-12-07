package chapter6;

public class Chapter6_7 {

	public static void main (String[] args)
	{
		int toFactorialize = 4;
		System.out.printf("\nThe value of %d! = %d\n",toFactorialize, factorial(toFactorialize));
	}
	/*
	 * Returns the value of n!
	 * 
	 * @param x the integer to derive the factorial
	 * 
	 * @return the value of n!
	 *  
	 */
	public static int factorial (int n)
	{
		if (n == 0)
		{
			return 1;
		}
		int recurse = factorial(n-1);
		int result = n * recurse;
		System.out.printf("n = %d\t n! = %d\n", n, result);
		return result;
	}
}
