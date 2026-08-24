package CoreJava.Part3.collectionsFramwork.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set);
        // we can add duplicate values during compile time, but it will provide us unique elements at the runtime.
        //i.e. after execution.
         
        System.err.println(set.contains(20));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.removeAll(set));
        System.out.println(set);
    }
}
