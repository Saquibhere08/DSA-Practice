package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set set=new LinkedHashSet();
		set.add(10);
		set.add(1.45);
		set.add(true);
		set.add("hi");
		set.add(10);
		set.add(false);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
	}
}
