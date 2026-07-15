package MultiThreading;

public class Driver {
	public static void main(String[] args) {
		//Method1: Using Extends Thread method()
		A a=new A();
		B b=new B();
		
		//Method 2: Using implementation of Runnable Interface
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		
		t1.start();
		t2.start();
	}
}
