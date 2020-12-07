package chapter7;

public class Chapter7_5 {


	public static void printTable(int rows) {
		int i;
		for (i = 1; i <= rows; i = i++) {
			printRow(i, rows);
		}
		System.out.println(i);
	}

	public static void printRow (int n, int cols)
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

	public static void main(String[] args) {
		{
			int sizeOfTable = 10;
			printTable(sizeOfTable);

		}
	}
}
