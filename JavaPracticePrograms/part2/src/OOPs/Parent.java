package OOPs;
//Class-Loading Process using Inheritance
public class Parent {
	static {
		System.out.println("Parent is loaded....");
	}
	static void scold() {
		System.out.println("Parents scolding Kids....");
	}
}
class child extends Parent{ 
	/*child is the Child class of Parent, So with the help of "extends" keyword
	 the child is acquiring the properties and behaviors of its parent
	 */
	static {
		System.out.println("Child is Loaded....");
	}
	static void respect() {
		System.out.println("Child respects Parent...");
	}
}
