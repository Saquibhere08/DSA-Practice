package Object;
//Buleprint- Pen
public class Diver {
public static void main(String[] args) {
	Pen p1=new Pen("Cello",20);
	Pen p2=new Pen("Cello",20);
	
	System.out.println(p1.equals(p2)?"same":"Not same"); //using Ternary Operator
}
}
