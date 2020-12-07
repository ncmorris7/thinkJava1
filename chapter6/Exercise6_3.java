package chapter6;

public class Exercise6_3 {

	public static void main(String[] args)
	{
		System.out.println(isTriangle(3,4,5));
		System.out.println(isTriangle(3,4,10));
	}
	public static boolean isTriangle(int a, int b, int c)
	{
		if(a>b+c)
		{
			return false;
		}
		if(b>a+c)
		{
			return false;
		}
		if(c>a+b)
		{
			return false;
		}
		return true;
	}
}
