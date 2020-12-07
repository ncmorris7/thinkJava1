package chapter7;

public class Chapter7_3 {
	
	
	
	public static void main (String[] args)
	{
		int sizeOfTable = 15;
		printTable(sizeOfTable);

	}
	public static void printRow(int n)
	{
		int i = 1;
		while (i <= 10)
		{
			System.out.printf("%4d",n*i);
			i = i + 1;
		}
		System.out.println();
	}
	
	public static void printTable(int n)
	{
		int i = 1;
		while (i <= n)
		{
			printRow(i);
			i = i +1;
		}
	}
}
