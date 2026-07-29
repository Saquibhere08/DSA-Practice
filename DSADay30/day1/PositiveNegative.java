package DSADay30.day1;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();

        if(n>0)
            System.out.println(n+" is positive");
        else
            System.out.println(n+" is Negative");
    }
}
