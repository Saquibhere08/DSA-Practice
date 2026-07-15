package Set;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample {
	public static void main(String[] args) {
	Set set=new HashSet();
	set.add(10);
	set.add(1.45);
	set.add(true);
	set.add("hi");
	set.add(10);
	set.add(false);
	set.add(null);
	set.add(null);	//it will only allow 1 null value, no matter how many we add it
	
	System.out.println(set);
	//Note: It will randomly print the order of the objects as it doesn't follow / maintain insertion order.
	
	}
}
