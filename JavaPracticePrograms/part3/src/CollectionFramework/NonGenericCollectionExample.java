package CollectionFramework;
import java.util.*;
public class NonGenericCollectionExample {

public static void main(String[] args) {
			List  list=new ArrayList();
			
			list.add(12);
			list.add("hi");
			list.add(true);
			list.add(null);
			list.add('j');
			list.add(89);
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
//			System.out.println("for-each loop");
//			for(object i:list) {
//				System.out.println(i);
//			}
			//We can't use for-each loop to modify a collection we get ----> ConcurrentModificationException (whenever we try to update or modify)
		}
	}

