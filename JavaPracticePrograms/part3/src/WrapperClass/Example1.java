package WrapperClass;
public class Example1 {
	public static void main(String[] args) {
		int a=100;	//primitive
		Integer i=Integer.valueOf(a); //Java will automatically performs primitive ---> object
		System.out.println("a: "+a);
		System.out.println("i: "+i);
		Integer j=200;	//autoboxing: Process of converting the primitive datatype into non-primitive type (object) .
		System.out.println(j);
	}
}
