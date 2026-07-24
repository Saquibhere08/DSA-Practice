package numberPrograms;

import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//userInput
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		System.out.println(isSunny(n) ? "Sunny Number":"Not Sunny Number");
	}
	public static boolean isSunny(int n) {
		for(int i=1;i<=(n+1)/2;i++) {
			if(i*i==i+1) {
				return true;
			}
		
		}
		return false;
	}
}
