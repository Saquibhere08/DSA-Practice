package LinkedList;

import java.util.LinkedList;

public class GenericLinkedList2 {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("hello");
		list.add("hi");
		list.addLast("SQL"); 	//adds the object in the last position
		list.addFirst("Python");	//adds the object in first position
		list.add("bye");
		list.add("sad");
		list.add("happy");
		list.add("java");
		list.add("programming");
		list.add(null);	//can store null values
		//list.add(true);	will not store boolean values in String type
		//here we cannot store any type of data, as objects	It must be a single type
		System.out.println(list);
	}
}
