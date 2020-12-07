package chapter7;

public class Chapter7_1 {

	public static void main(String[] args)
	{
		//countdown(10);
		sequence(3);
	}
	public static void countdown(int n)
	{
		while (n>0)
		{
			System.out.println(n);
			n = n-1;
		}
		System.out.println("Blastoff!");
	}
	public static void sequence(int n) //aka the Collatz Conjecture
	{
		while (n!=1)
		{
			System.out.println(n);
			if(n%2 == 0)
			{
				n = n/2;
			}
			else
			{
				n = n*3+1;
			}
		}
	}
}
