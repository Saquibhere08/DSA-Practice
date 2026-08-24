package CoreJava.Part3.collectionsFramwork.List.Vector.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack <Integer> stack=new Stack<>();

        //push(Object o)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: "+stack);
        System.out.println("Size: "+stack.size());

        //pop(object o)
        stack.pop();
        System.out.println("Stack: "+stack);
        System.out.println("Size: "+stack.size());

        //peek()
        System.out.println("Peek: "+stack.peek());
        System.out.println("Size: "+stack.size());

        System.out.println("Stack Empty? :"+stack.isEmpty());

        //search(Object o)
        System.out.println("Index of 20: "+stack.search(20));



    }
}
