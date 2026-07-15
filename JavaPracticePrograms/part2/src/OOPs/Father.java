package OOPs;
//Example of "super" and "this" keyword
public class Father {
	String name="Blake";
}
class Son extends Father{
	String name="Smith";
	
	void sonDetails() {
		System.out.println("Fathers Name: "+super.name);
		System.out.println("Sons Name: "+this.name);
	}
}
