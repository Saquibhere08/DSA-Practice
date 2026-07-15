package lambdaExpression;

interface addition{	//interface
	void add(int a,int b);	//with exactly one abstract method
	
}

public class Example1 {
	public static void main(String[] args) {
		addition obj=(a,b) ->{
			System.out.println(a+b);
	};
obj.add(10,20);
}
}
