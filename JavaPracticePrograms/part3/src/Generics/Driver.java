package Generics;

public class Driver {
	public static void main(String[] args) {
		Products<String,Double> p1=new Products<>("Apple",20.0);
		Products<String,Double> p2=new Products<>("Banana",30.0);
		
		
		System.out.println(p1.getClass());
		System.out.println(p1.getItem());
		System.out.println(p1.getPrice());
		
		System.out.println(p2.getClass());
		System.out.println(p2.getItem());
		System.out.println(p2.getPrice());
	}
}
