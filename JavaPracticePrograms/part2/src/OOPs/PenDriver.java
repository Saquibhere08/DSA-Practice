package OOPs;

public class PenDriver {
	public static void main(String[] args) {
		Pen p=Pens.createPen();
		System.out.println("Brand: "+p.brand);
		System.out.println("Color: "+p.color);
		
	}
}
