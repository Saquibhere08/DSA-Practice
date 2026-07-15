package CollectionFramework;

import java.util.*;

public class GenericCollectionExample {
	public static void main(String[] args) {
		List <Integer> list=new ArrayList<>();
		
		list.add(12);
		list.add(13);
		list.add(17);
		list.add(22);
		list.add(02);
		list.add(62);
		System.out.println(list);
		//Different ways to iterate over an arrayList
		//for-loop
		System.out.println("for Loop");
		for(int i=0;i<list.size();i++) {
			//System.out.println(list);
			System.out.println(list.get(i));
		}
		//for-each loop
		//(advanced for loop)
		System.out.println("for-each loop");
		for(int i:list) {
			System.out.println(i);
		}
	}
}
