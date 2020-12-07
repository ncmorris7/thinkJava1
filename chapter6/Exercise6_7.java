package chapter6;

public class Exercise6_7 {

	public static void main(String[] args)
	{
		System.out.println(oddSum(10));
	}
	public static int oddSum(int n)
	{
		int sum = 0;
		if (n == 0)
		{
			return 0;
		}
		if (n%2!=0)
		{
			sum = n;
			System.out.println(sum);
		}
		else
		{
			sum = 0;
		}
		sum += oddSum(n-1); 
		return sum;
	}
}
