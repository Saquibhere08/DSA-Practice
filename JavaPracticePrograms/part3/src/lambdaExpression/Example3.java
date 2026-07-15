package lambdaExpression;

public class Example3 {
	public static void main(String[] args) {
		operations mul=(a,b) -> System.out.println(a*b);
		
		mul.result(32, 22);
	}
}
//We can initialized the lambda expression without the parenthesis