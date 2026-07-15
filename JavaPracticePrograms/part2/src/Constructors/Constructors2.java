package Constructors;

public class Constructors2 {
//Non-Parameterized Constructor - User Defined Constructors
String title;
double price;
	public Constructors2() {
	//No Formal-Arguments
}
	public static void main(String[] args) {
		Constructors2 c=new Constructors2();
		System.out.println(c.title);
		System.out.println(c.price); 
		//As we didn't initialized in the constructor, so we only get the null values.
		System.out.println("+===========================+");
		c.title="Atomic Habits";
		c.price=2000;
		System.out.println(c.title);
		System.out.println(c.price);
		//but we can initialized inside the main method with the object reference and get the values
	}
}
