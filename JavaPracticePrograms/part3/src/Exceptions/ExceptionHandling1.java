package Exceptions;
public class ExceptionHandling1 {
	public static void main(String[] args) {
		int a=10;
		int b =0;
		
		try {
			int c=a/b;
		} catch (ArithmeticException e) { //ArithmeticException
			// TODO: handle exception
			System.out.println("Cannot divide by zero");
			System.out.println("Throws ArithmeticException");
		}
	
		
	}
}
