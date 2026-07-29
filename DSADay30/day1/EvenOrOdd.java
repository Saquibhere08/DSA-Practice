package DSADay30.day1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();

        if(n%2==0)
            System.out.println("Even: "+n);
        else
            System.out.println("Odd: "+n);

    }
}
