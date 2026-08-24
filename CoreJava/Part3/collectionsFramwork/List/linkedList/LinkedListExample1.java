package CoreJava.Part3.collectionsFramwork.List.linkedList;

import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        
        //insertion of an object
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        System.out.println(linkedList);
        //inserting at the first
        System.out.println("Insertion at first 0: ");
        linkedList.addFirst(0);
        System.out.println(linkedList);
        //inserting at the last
        System.out.println("Insertion at Last 99: ");
        linkedList.addLast(99);
        System.out.println(linkedList);

        //retrive an object
        System.out.println("Retrieve first element: ");
        System.out.println(linkedList.getFirst());

        System.out.println("Retrieve last element: ");
        System.out.println(linkedList.getLast());

        //deletion of an object
        System.out.println("removing with an condition: ");
        System.out.println("Remove even elements: "+linkedList.removeIf(x->x%2==0));
        System.out.println("Result: "+linkedList);

        System.out.println("Remove all Objects");
        System.out.println(linkedList.removeAll(linkedList));
        System.out.println("Result: "+linkedList);
    }
}
