package OOPs;
public class Pens {

    // Factory Method
    public static Pen createPen() {
    	
    	Pen p = new Pen("Reynolds", "Blue");

        return p;   // Returning Object
    }
}