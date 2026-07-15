package Object;

public class Demo1 {
public static void main(String[] args) {
	//Car c=new Car("Toyota", "Black", 1222220);
	
}

class Car{
	String brand;
	String color;
	double price;
	public Car(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "Brand: "+brand+"\nColor: "+color+"\nPrice: "+price;
	}
	
}
}
