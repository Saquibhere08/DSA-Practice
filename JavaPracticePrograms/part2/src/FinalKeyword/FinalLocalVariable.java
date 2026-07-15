package FinalKeyword;

public class FinalLocalVariable {
	public static void main(String[] args) {
		final int a; //Final Local Variable
		a=100;
		System.out.println(a);
		//a=200; 
		/*We cannot  update the variable 'a 'here as  it was declared as Final at the time of initialization*/
	}
}
