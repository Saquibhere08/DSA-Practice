package FinalKeyword;

public class FinalNonStaticVariable {
	//Global Variables- Final Non-Static Variables
	final int a=100;
	final int b;
	final int c;
	public FinalNonStaticVariable() {
		b=200;
		c=300;
	}
	public static void main(String[] args) {
		FinalNonStaticVariable f=new FinalNonStaticVariable();
		System.out.println("a: "+f.a);
		System.out.println("b: "+f.b);
		System.out.println("c: "+f.c);
	}
	/*
	 We can Declare a final non-static variable in 3 ways:
	 *Directly at the time of declaration 
	 * By using Non-static Block
	 * By using Constructors
	 */
}
