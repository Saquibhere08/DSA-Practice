package Exceptions;

public class ExceptionHandling6 {
//finally
	    public static void main(String[] args) {
	        try {
	            int result = 10 / 0;
	        } catch (ArithmeticException e) {
	            System.out.println("Exception Handled");
	            System.out.println("Throws Arithmetic Exception");
	        } finally {
	            System.out.println("Finally Block Executed");
	        }
	    }
	}