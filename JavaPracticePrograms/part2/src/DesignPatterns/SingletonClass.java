package DesignPatterns;
/*
 * Singleton Class: A class which allows us to create only one object is known as Singleton Class
 */
public class SingletonClass {
	private static SingletonClass obj =null; //Step2: Create a private static ref variable
	
	private SingletonClass() { //Step1: Make the constructor as Private
	}
	
	//Step3: Factory Method to return the object
	static SingletonClass getSingletonClass() {
		if(obj ==null) {
			obj=new SingletonClass();
		}
		return obj;
	}
}
