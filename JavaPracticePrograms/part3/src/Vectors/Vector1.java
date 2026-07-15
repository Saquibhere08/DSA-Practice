package Vectors;

import java.util.Vector;
//vectors are just like arrayList, it also uses resizable array,
//but vectors are thread safe but not the arrayList, because vectors are synchronised.

public class Vector1 {
	public static void main(String[] args) {
		//Non-Generic
		Vector list=new Vector();
		list.add(10);
		list.add(true);
		list.add("hello");
		list.add(2.5);
		list.add(null);
		list.add(5000000);
		System.out.println(list);
}
}
