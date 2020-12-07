package chapter6;
import java.math.*;
public class Exercise6_4 {

	public static void main(String[] args)
	{
		System.out.println(multadd(1.0,2.0,3.0));
		System.out.println(multadd(Math.sin(Math.PI/4),0.5,(Math.cos(Math.PI/4)/2)));
		System.out.println(multadd(1,Math.log(10),Math.log(20)));
		//This last one is very, for-sure wrong. Log can suck it. 
		
		System.out.println(expSum(3.4));
	}
	public static double multadd(double a, double b, double c)
	{
		return a*b+c;
	}
	
	public static double expSum(double x)
	{
		double a1 = x;
		double b1 = Math.exp(-x);
		double c1 = Math.sqrt((1-Math.exp(-x)));
		
		return multadd(a1,b1,c1);
	}
}
