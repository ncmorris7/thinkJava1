package chapter5;

public class Chapter5_5 {
	//Flag variables

	public static void main(String[] args) {
		//Variable declaration
		boolean flag;
		//Variable assignment 
		flag = true;
		//Variable declaration *and* assignment;
		boolean testResult = false;
		int n = -2;
		boolean evenFlag = (n%2==0); //Storing the "result of a comparison in a variable"
		boolean positiveFlag = (n>0);//Storing the "result of a comparison in a variable"

		if (evenFlag) {
			System.out.println("n was even when I checked it!");
		}
		if (!evenFlag) {
			System.out.println("n was odd when I checked it!");		
		}
		
		
	}
}
