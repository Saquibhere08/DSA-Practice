package Vectors;

import java.util.Vector;

public class Vector2 {
public static void main(String[] args) {
	//Generic
	Vector<Integer> list=new Vector<>();
	list.add(10);
	//list.add(true);
	//list.add("hello");
	//list.add(2.5);
	list.add(null);
	list.add(5000000);
	list.add(2);
	list.addFirst(1);
	list.addLast(0);
	list.add(77);
	list.add(86);

	
	
	System.out.println(list);
}
}
