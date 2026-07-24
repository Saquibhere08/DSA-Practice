package numberPrograms;

import java.util.Scanner;

public class FirstDigitEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//userInput
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int res=0;
		int i=0;
		while(n>0) {
			i=n%10;
			res=(res*10)+i;
			n=n/10;			
		}
		if(i<res) {
			if(i%2==0) {
				System.out.println("Even Number: "+i);
			}else
				System.out.println("Odd Number: "+i);
		}
	}
}
