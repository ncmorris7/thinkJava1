package chapter6;

public class Exercise6_6 {

	public static void main (String[] args)
	{
		System.out.println(reProd(1, 4));
	}
	public static int prod(int m, int n) {
		if (m == n) {
			return n;
		} else {
			int recurse = prod(m, n - 1);
			int result = n * recurse;
			return result;
		}
	}
	public static int reProd(int m, int n)
	{
		if(m==n)
		{
			return n;
		}
		else
		{
			return (reProd(m, n-1)*n);
		}
	}
	
}

/* Exercise 6.6.1:
 * call 1:
 * m = 1 n = 4 recurse = prod(1, 3)
 * 
 *  call 2:
 *  m = 1 n = 3 recurse = prod(1, 2)
 *  
 *  call 3:
 *  m = 1 n = 2 recurse = prod(1, 1)
 *  
 *  call 4:
 *  m = 1 n = 1 return n (aka 1) <<Last invocation before prod completes?
 *  
 *  going back up:
 *  call 4:
 *  result = 1 * 1
 *  
 *  call 3:
 *  result = 2 * 1
 *  
 *  call 2:
 *  result = 3 * 2
 *  
 *  call 1:
 *  result = 4 * 6
 *  
 *  6.6.2:
 *  result = 24
 * 
 * 6.6.3:
 * It computes factorials.
 * 
 * 6.6.4:
 * see reProd.
 */
