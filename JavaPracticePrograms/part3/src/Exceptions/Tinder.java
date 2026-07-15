package Exceptions;

import java.util.Scanner;

public class Tinder {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		System.out.println("Gender: ");
		String gender=sc.next();
		
		if(age>=21) {
			System.out.println("Hey "+ name+ " ... find your love..");
		}else
			throw new MinorAgeException("Still You are a Kid, come after "+(21-age)+ " years");
	}
}
