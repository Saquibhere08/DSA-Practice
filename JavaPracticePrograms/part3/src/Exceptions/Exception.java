package Exceptions;
public class Exception {
public Exception(String message) {
		// TODO Auto-generated constructor stub
	}

	/*
 What is an exception?
 An Excception is an unwanted event that occurs during the execution
 of any program and it distrubs the normal flow of the program execution.
 */
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=a/b;
		
		System.out.println(c);
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//The above message is shown, while executing this program, so we can say that it will throw an exceptions, as while divison, the denominator cannot be 0.
		// so it will Arithmetic Exception
	}
}
