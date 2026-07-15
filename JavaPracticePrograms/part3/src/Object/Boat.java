package Object;
//hashcode()
public class Boat {
	String brand;
	String color;
	public Boat(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}
	
	@Override
	public int hashCode() {
		
		return brand.hashCode()+color.hashCode();
	}
	
	
}
