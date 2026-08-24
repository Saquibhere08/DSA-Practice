package CoreJava.Part3.collectionsFramwork.List.Vector.Stack;

import java.util.LinkedList;

public class StackExample1 {
    public static void main(String[] args) {
        //using Linkedlist as Stack
        LinkedList<Integer> st=new LinkedList<>();
        //push into the stack
        st.addLast(10);
        st.addLast(20);
        st.addLast(30);
        st.addLast(40);
        //so we can use LinkedList as Stack

        //peek
        System.out.println(st.get(st.size()-1));

        //pop
        System.out.println(st.remove(st.size()-1));


    }
}
