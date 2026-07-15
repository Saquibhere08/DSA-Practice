package OOPs;
public class CompileTimePolymorphism {
	int add(int a, int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	//same Name but different Parameters - Method Overloading
	public static void main(String[] args) {
		CompileTimePolymorphism c=new CompileTimePolymorphism();
		System.out.println(c.add(30, 200));
		System.out.println(c.add(34,23 , 90));
	}
}
