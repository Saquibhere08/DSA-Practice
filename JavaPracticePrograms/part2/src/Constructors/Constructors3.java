package Constructors;

public class Constructors3 {
//Parameterized Constructor -User Defined Constructor
	String title;
	double price;
	public Constructors3(String title,double price) {
		this.price=price;
		this.title=title;
	}
	public static void main(String[] args) {
		Constructors3 c=new Constructors3("Atomic Habits", 799);
		System.out.println("Book Name:"+c.title);
		System.out.println("Price: "+c.price);
	}
}
