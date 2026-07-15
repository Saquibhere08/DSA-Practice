package Exceptions;

public class ExceptionHandling5 {
	    public static void main(String[] args) {
	        try {
	            int[] arr = {1, 2, 3};
	            System.out.println(arr[5]);
	        } catch (ArithmeticException e) {//Multi-Catch Blocks
	            System.out.println("Arithmetic Exception");
	        } catch (ArrayIndexOutOfBoundsException e) { //Multi-Catch Blocks
	            System.out.println("Array Index Exception");
	            System.out.println("Called Multi-Catch Blocks");
	        }
	    }
	}
