package CoreJava.Part3.collectionsFramwork.List.Vector.Stack;


import java.util.ArrayList;

public class StackExample2 {
    public static void main(String[] args) {
        //using Arraylist as Stack
        ArrayList<Integer> st=new ArrayList<>();
        //push into the stack
        st.addLast(101);
        st.addLast(202);
        st.addLast(303);
        st.addLast(404);
        //so we can use LinkedList as Stack

        //peek
        System.out.println(st.get(st.size()-1));

        //pop
        System.out.println(st.remove(st.size()-1));
    }
}
