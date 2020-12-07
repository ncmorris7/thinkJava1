package chapter6;

public class Exercise6_9 {

	public static void main(String[] args)
	{
		System.out.println(power(3,8));
	}
	public static double power(double x, int n)
	{
		double result = 0;
		if (n==0)
		{
			return 1;
		}
		else
		{
			return x*power(x,n-1);
		}
		
	}
}
