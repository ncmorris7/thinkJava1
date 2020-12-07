package chapter7;

public class Chapter7_4 {

	public static void main (String[] args)
	{
		int sizeOfTable = 10;
		printTable(sizeOfTable);

	}
	public static void printRow(int n, int cols)
	//n = the value of the multiples to be displayed; cols = the number of columns
	{
		int i = 1;
		while (i <= cols)
		{
			System.out.printf("%4d",n*i);
			i = i + 1;
		}
		System.out.println();
	}
	
	public static void printTable(int rows)
	{
		int i = 1;
		while (i <= rows)
		{
			printRow(i, i); // ab = ba ~> not printing redundant values
			i = i +1;
		}
	}
}

