package Object;

public class PenDriver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Pen p1=new Pen("Cello",20);
		Pen p2 = (Pen) p1.clone();
		
		System.out.println(p1);
		System.out.println("======================");
		System.out.println(p2);
	}
}
