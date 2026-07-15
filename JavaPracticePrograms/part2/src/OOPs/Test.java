package OOPs;
//child class of Inheritance1
public class Test extends Inheritance1{
	static int b=200;
	static void display() {
		System.out.println("bye");
	}
	public static void main(String[] args) {
		System.out.println(b);
		display();
/*we can also use the members in the Inheritance1 as
it inherits the properties and behaviors of the parent class i.e. Inheritance1.
*/
		System.out.println(Inheritance1.a);
		Inheritance1.display();
	}
}
