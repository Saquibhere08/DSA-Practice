package OOPs;
//parent class of Test
public class Inheritance1 {
	static int a=100;
	static void display() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		//inherit static members
		System.out.println(a);
		display();
	}
}
