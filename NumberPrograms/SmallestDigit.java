package numberPrograms;

import java.util.Scanner;

public class SmallestDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//userInput
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int smallest=9;	//becoz there is no digit greater than 9
		while(n>0) {
			
			int i=n%10;
			if(i<smallest) {
				smallest=i;
			}
			n=n/10;
		}
		System.out.println("Smallest digit: "+smallest);
	}
}
