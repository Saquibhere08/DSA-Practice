package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting1 {
	public static void main(String[] args) {
		//sorting based on single field
		List <Integer> list=Arrays.asList(8,2,3,4,6,56,42,11,21,1);
		System.out.println("Unsorted List: "+list);
		Collections.sort(list);	
		//used to provide some methods to perform operations
		//it is present in java.util package
		//sort method is present in Collection class
		System.out.println("Sorted List: "+list);
	}
}
