package Exceptions;
public class ExceptionHandling3 {
	public static void main(String[] args) {
		try {
			int [] arr= {10,20,30,40};
			System.out.println(arr[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Array Index Number");
			System.out.println("Throws ArrayIndexOutOfBoundsException");
		}
	}
}
