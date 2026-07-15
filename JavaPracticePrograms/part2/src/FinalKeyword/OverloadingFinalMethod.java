package FinalKeyword;

public class OverloadingFinalMethod {
	final static void seeing(int a) {
		System.out.println("Parent is using "+a+" eyes");
	}
	final static void seeing(int a,int b) {
		System.out.println("Parents are using "+(a+b)+" eyes");
	}
	final public static void main(String[] args) { //we can also declare the main method as final
		OverloadingFinalMethod.seeing(1);
		OverloadingFinalMethod.seeing(1, 1);
	}
}
/*
  Note:
  We can do overloading 
 with final keyword but cannot perform method overrinding 
 */