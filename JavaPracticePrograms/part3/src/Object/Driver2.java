package Object;

public class Driver2 {
//Case2: Checks ref but found different memory locations even though the values are same
	public static void main(String[] args) {
		Pen p1=new Pen("Cello",20);
		Pen p2=new Pen("Cello",20);
		
		//checking
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
	}
}
