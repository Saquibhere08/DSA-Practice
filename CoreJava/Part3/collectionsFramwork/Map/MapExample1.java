package CoreJava.Part3.collectionsFramwork.Map;

import java.util.HashMap;
// import java.util.Set;

//HashMap
public class MapExample1 {
    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<>();

        //put()
        System.out.println();
        h.put(1, "Saquib");
        h.put(2, "Nazeeb");
        h.put(3, "Faisal");
        h.put(4, "kaushik");

        System.out.println("Map: "+h);
        System.out.println();

        //get()
        String res1=h.get(3);
        System.out.println(res1);
        String res2=h.get(1);
        System.out.println(res2);
        System.out.println();

        //containsKey()
        System.out.println(h.containsKey(4));
        System.out.println(h.get(10));
        System.out.println();

        //conatinsValue()
        System.out.println(h.containsValue("kaushik"));
        System.out.println(h.containsValue("Nazza"));
        System.out.println();

        //keySet()
        // Set<Integer> set=h.keySet();
        // for (Integer i : set) {
        //     System.out.println(h.get(i));
        // }

        for (Integer i : h.keySet()) {
                System.out.println(h.get(i));
        }

    }
}
