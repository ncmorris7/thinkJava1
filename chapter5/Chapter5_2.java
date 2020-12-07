package chapter5;

public class Chapter5_2 {
	//Logical Operators
	
	public static void main(String[] args) {
		//Declare variables
		int x = 7;
		int y = 2;
		
		//Just out here running through De Morgan's laws, I guess...
		System.out.println(!(x<5 && y ==3));
		System.out.println(x>=5||y!=3);

	}

}
