package numberPrograms;

import java.util.Scanner;

//2.print the even digits of a number
public class EvenDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//userInput
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		while(num>0) {
			int i=num%10;
			num=num/10;
			
			if(i%2==0) {
				System.out.println("Even Digit: "+i);
			}
		}
		
		
		
		
		
		
		
	}
}
