package Object;

public class BoatDriver {
public static void main(String[] args) {
	Boat p1=new Boat("Tarzan","Black");
	Boat p2=new Boat("Tarzan","Black");
	
	System.out.println(p1);
	System.out.println(p2);
	
	System.out.println(p1.getClass()); //getClass()
}
}
