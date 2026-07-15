package OOPs;
//AbstractClassExample - Main

abstract class AbstractClassExample {
	abstract void start();
}
class Car extends AbstractClassExample{
	@Override
	void start() {
		System.out.println("Car starts with a Key");
		
	}
}
