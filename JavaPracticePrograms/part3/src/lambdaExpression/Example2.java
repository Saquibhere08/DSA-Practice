package lambdaExpression;

public class Example2 {
	public static void main(String[] args) {
		operations sb= (a,b) ->{
			System.out.println(a-b);
		};
		sb.result(23, 3);
	}
}
