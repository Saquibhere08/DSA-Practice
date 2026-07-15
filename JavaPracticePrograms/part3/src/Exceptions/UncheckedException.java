package Exceptions;

public class UncheckedException {
public static void main(String[] args) {
	System.out.println("main Starts");
	div(20,0); //unchecked exception by the compiler
	System.out.println("main Ends");
}
public static void div(int n1,int n2) throws ArithmeticException{
	System.out.println("div starts");
	System.out.println(n1/n2);//unchecked exception by the compiler
	System.out.println("div ends");
}
}
