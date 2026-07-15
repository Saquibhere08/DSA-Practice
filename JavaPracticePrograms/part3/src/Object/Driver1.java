package Object;

public class Driver1 {
//Case1: Checks the Reference
	public static void main(String[] args) {
		Pen p1=new Pen("Cello",10);
		Pen p2 =p1;
		
		//checking
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	}
}
