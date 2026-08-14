package CoreJava.collections.List.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1=new LinkedList<>(Arrays.asList("Cat","Dog","Elephant","Cow"));
        LinkedList <String> linkedList2=new LinkedList<>(Arrays.asList("Dog","Cow"));

        System.out.println("List 1: "+linkedList1);
        System.out.println("List 2: "+linkedList2);

        System.out.println("Remove all objects of list 1 from list 2");
        linkedList1.removeAll(linkedList2);
        System.out.println(linkedList1);

    }
}
