package CoreJava.Part3.collectionsFramwork.set;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();

        set.add(10);
        set.add(21);
        set.add(32);
        set.add(11);
        set.add(28);
        set.add(30);

        System.out.println(set);

        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.higher(20));
        System.out.println(set.lower(10));
    }
}
