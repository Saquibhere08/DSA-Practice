package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting2 {
	public static void main(String[] args) {
		List <Integer> list=new ArrayList<>();
//		list.add("HI");	//rule 1: objects should be homogeneous ----->Class Cast Exception
										//rule 2: objects should be of comparable type
		list.add(1);
		list.add(20);
//		list.add(null);	//rule 3: If we provide null ---> Null Pointer Exception
		list.add(1);
		list.add(69);
		list.add(66);
		list.add(22);
		list.add(3);
		System.out.println("Unsorted List: "+list);
		Collections.sort(list);
		System.out.println("Sorted List: "+list);
	}
}
