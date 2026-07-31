package DSADay30.day2;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age=sc.nextInt();
        
        if(age>=18){
            System.out.println("Eligible to Vote");
        }else if(age<18){
            System.out.println("Not Eligible to Vote");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
