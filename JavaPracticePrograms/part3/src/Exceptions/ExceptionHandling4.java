package Exceptions;

public class ExceptionHandling4 {
public static void main(String[] args) {
	        try {
	            String s = "abc";
	            int num = Integer.parseInt(s);
	            System.out.println(num);
	        } catch (NumberFormatException e) { //NumberFormatException
	            System.out.println("Invalid number format!");
	            System.out.println("Throws NumberFormatException");
	        }
	    }
	}

