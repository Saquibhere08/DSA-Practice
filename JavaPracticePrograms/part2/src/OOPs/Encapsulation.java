
package OOPs;

import java.util.Scanner;
public class Encapsulation {
	private double sal;
	
	
	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		if(sal>0)
			this.sal = sal;
	}


	public static void main(String[] args) {
		//Encapsulation
		Encapsulation em=new Encapsulation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary: ");
		double salary=sc.nextInt();
		em.setSal(salary);
		System.out.println("Salary: "+em.getSal());
		
		
	}
}
