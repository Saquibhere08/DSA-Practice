package InterfaceExamples;

public class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("Meow Meeeoww");
		
	}
	@Override
	public void checkBite() {
		System.out.println("Cat don't Bites");
	}
	}
