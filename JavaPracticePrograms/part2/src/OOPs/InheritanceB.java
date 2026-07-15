package OOPs;
//Single -Level Inheritance Example
public class InheritanceB extends InheritanceA{
	public void code() {
		System.out.println("Coding");
	}
	
	public static void main(String[] args) {
		InheritanceB i= new InheritanceB();
		i.code();
		i.work();
	}
}