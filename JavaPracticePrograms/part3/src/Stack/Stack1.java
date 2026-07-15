package Stack;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		//Non-Generic Example
		Stack list=new Stack();
		list.add(10);
		list.add(true);
		list.add("hello");
		list.add(2.5);
		list.add(null);
		list.add(5000000);
		System.out.println("Stack: "+list);
		
		//stack operations --> push,pop,peek
		
	//push(Object o) --> used to add new object on top of the stack
		System.out.println("Pushing : "+list.push(77));
		System.out.println("Pushing : "+list.push(76));
		System.out.println("Pushing : "+list.push(89));
		
		System.out.println("Updated Stack: "+list);
		
	//pop() --> used to remove and return object which is top of the stack
		System.out.println("Popping: "+list.pop());
		System.out.println("Popping: "+list.pop());
		System.out.println("Popping: "+list.pop());
		
		System.out.println("Updated Stack: "+list);
		
	//peek() --> used to return the object from top of the stack without removing it
		System.out.println("Peeking: "+list.peek());
		System.out.println("Peeking: "+list.peek());
		System.out.println("Peeking: "+list.peek());//No-matter how many peek() operations we perform, it will only return the object which is on top of the stack
		
		System.out.println("Updated Stack: "+list);
		
	//search(object 0) --> used to check weather the given object is present or not
		System.out.println("Searching: "+list.search(45));	//if object not present return --> -1
		System.out.println("Searching: "+list.search(true)); 
		System.out.println("Searching: "+list.search(10)); 	//if object present, returns ---> offset value (count 1 to N from top of the stack)
		
		System.out.println("Updated Stack: "+list);
		
	}
}
