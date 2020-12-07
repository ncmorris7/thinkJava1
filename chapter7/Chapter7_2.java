package chapter7;
import java.math.*;
public class Chapter7_2 {

	public static void main (String[] args)
	{
		//Aritmetic Sequence:
//		int i = 1;
//		while (i < 10)
//		{
//			double x = i;
//			System.out.println(x+"\t"+Math.log(x)/Math.log(2));
//			i = i+1;
//		}
		//Geometic Sequence:
		final double LOG2 = Math.log(2);
		int i = 1;
		while (i < 100)
		{
			double x = i;
			System.out.println(x+"\t"+Math.log(x)/LOG2);
			i = i*2;
		}
	}
}
