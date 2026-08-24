package CoreJava.Part3.collectionsFramwork.List.Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector <Integer> vector=new Vector<>(5,3);
        //inserting objects into the vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        //checking capcity
        System.out.println("Initial Capacity of Vector: "+vector.capacity());
        vector.add(99);
        //checking capcity
        System.out.println("Incremental Capacity of Vector: "+vector.capacity());
        System.out.println(vector);

        //clear() - clear out the objects present in the vector list
        vector.clear();
        System.out.println(vector);

    }
}
