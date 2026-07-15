package Generics;

class Container<T>{	//placeholder for generics
	T value;
	public void show() {
		System.out.println(value.getClass().getName());
	}
}
public class Example1 {
	public static void main(String[] args) {
		Container con=new Container();
		con.value="Hi";
		con.show();
		con.value=9;
		con.show();
		con.value=true;
		con.show();
	}
}	
/*
Generics:  A concept where you can write a class ,interface,or method
that is compatible with different datatypes.
*<T> type parameter (it is a placeholder that gets replaced with a real type)
*<String> type arguments (specifies the type)

*/