package Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDesc {
	public static void main(String[] args) {
		Set<Integer> set=new TreeSet<Integer>((a,b)-> b-a);	
		//it will print in descending order now
		
		
		set.add(10);
		set.add(22);
		set.add(99);
		set.add(1);
		set.add(0);
		set.add(15);
		set.add(999);
		set.add(44);
		set.add(13);
		set.add(40);
		
		System.out.println(set);
	}
}
