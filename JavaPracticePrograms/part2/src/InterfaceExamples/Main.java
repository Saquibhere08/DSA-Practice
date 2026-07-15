package InterfaceExamples;

public class Main  {
	public static void main(String[] args) {
		Animal a=new Dog();
		a.sound();
		a.checkBite();
		a=new Cat();
		a.sound();
		a.checkBite();
	}
}
