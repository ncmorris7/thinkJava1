package chapter4;

public class Exercise4_3 {

	public static void main (String[] args) {
		String day = "Friday";
		int date = 13;
		String month = "July";
		int year = 2020;
		printAmerican(day, date, month, year);
		printEuropean(day, date, month, year);
	}
	public static void printAmerican(String day, int date, String month, int year) {
		System.out.println("American format: \n"+day + ", "+month+ " "+date+", "+year+".");
	}
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println("European format: \n"+day+ " "+date+ " "+month+" "+year+".");
	}
}
