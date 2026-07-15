package LinkedList;

import java.util.LinkedList;

public class GenericLinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		//list.add(true);
		//list.add("hello");	//cannot store string values in Integer type
		//list.add(2.5);
		list.add(null);	//can store null values
		list.add(5000000);
		list.add(23);
		list.add(32);
		list.add(90);
		list.add(999);
		//here we cannot store any type of data, as objects. It must be a single type
		System.out.println(list);
	}
}
