package chapter6;

public class Exercise6_8 {

	public static void main(String[] args)
	{
		System.out.println(ack(3,10));
	}
	public static int ack (int m, int n)
	{
		int result=0;
		if (m == 0)
		{
			result = n+1;
		}
		if (m>0 && n == 0)
		{
			result = ack(m-1,1);
		}
		if (m>0 && n>0)
		{
			result = ack(m-1,ack(m,n-1));
		}
		return result;
	}
}
