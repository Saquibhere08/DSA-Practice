package InterfaceExamples;

class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Bow Bow");
		
		
	}

	@Override
	public void checkBite() {
		System.out.println("Dog Bites");
		
	}
	
}
