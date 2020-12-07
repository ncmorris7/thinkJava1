package chapter6;

public class Chapter6_9 {
/*
 * Chapter 6.8, "Leap of Faith" included no code, but instead encouraged you to
 * trust the proper functioning of your properly functioning methods.
 */
	
	public static void main(String[] args)
	{
		int toInput = 15;
		System.out.printf("\nn = %d\tfibonacci sequence of %d = %d\n", toInput,toInput, fibonacci(toInput));
	}
	public static int fibonacci(int n)
	{
		if (n == 1 || n == 2) {
			return 1;
		}
		int fibonacciValue = fibonacci(n-1) + fibonacci(n-2);
		//woof I do not recommend attempting to make sense of this output stream.
		//System.out.printf("n = %d\t fibonacci value = %d\n", n, fibonacciValue);
		return fibonacciValue;
	
	}
}
