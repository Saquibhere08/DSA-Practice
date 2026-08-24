package CoreJava.Part3.collectionsFramwork.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer>set=new TreeSet<>();
        set.add(10);
        set.add(21);
        set.add(32);
        set.add(11);
        set.add(28);
        set.add(30);
        System.out.println(set);
        //Tree set will arranged the unsorted array into sorted array.
        
    }
}
