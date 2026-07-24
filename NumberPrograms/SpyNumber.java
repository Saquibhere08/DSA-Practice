package numberPrograms;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//userInput
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int prod=1;
		while(num>0) {
			int i=num%10;
			sum=sum+i;
			prod=prod*i;
			num=num/10;
			
		}
		if(sum==prod) {
			System.out.println("Spy number: "+temp);
		}else {
			System.out.println("Not a spy number: "+temp);
		}
	}
	}

