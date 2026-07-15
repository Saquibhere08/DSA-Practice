package CollectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(12,42,46,1,21,23,25,56,3);
		System.out.println("List: "+nums+" ");
		System.out.println();
		ListIterator <Integer> list=nums.listIterator();
		//Used for moving in both forward and backword direction
		
		//forward-direction
		System.out.println("Forward-Direction");
		while(list.hasNext()) {
			Integer i=list.next();
			if(i==1) {
				list.set(10);
				list.previous();
				System.out.print(list.next()+" ");
			}else
				System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("==========================");
		
		
		//Backward-direction
		System.out.println("Backward-Direction");
		while(list.hasPrevious()) {
			System.out.print(list.previous()+" ");
		}
		
	}
}
