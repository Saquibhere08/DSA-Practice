package Exceptions;
public class ExceptionHandling2 {
	public static void main(String[] args) {
		try {
			String str=null;
			System.out.println(str.length());
		} catch (NullPointerException e) { //NullPointerException

			System.out.println("Empty String");
			System.out.println("Throws NullPointerException");
		}
	}
}
