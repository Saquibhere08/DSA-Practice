package LinkedList;

import java.util.LinkedList;

public class NongenericLinkedList {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(true);
		list.add("hello");
		list.add(2.5);
		list.add(null);
		list.add(5000000);
		//here we can store any type of data, as objects
		System.out.println(list);
	}
}
