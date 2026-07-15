package MultiThreading;
/*
 Java provides two ways to create threads-
 * Method 1- Extending Thread Class
 * Method 2- Implementing Runnable Interface 
 */

class myThread extends Thread{
	public void run() {
		System.out.println("Thread is Running..");
	}
}
public class ThreadExample1 {
	public static void main(String[] args) {
		myThread m=new myThread();
		m.run(); 		// it runs like a normal method
		
		m.start();	// it creats a new thread and internally calls run().
	}
}
