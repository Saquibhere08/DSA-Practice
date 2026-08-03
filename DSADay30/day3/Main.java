package DSADay30.day3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        MultiplicationTable(n);
        Factorial(n);
        Fibonacci(n);
    }
    //1. Multiplication Table
    public static void MultiplicationTable(int n){
        System.out.println("Multiplication Table");
        for(int i=1;i<=10;i++){
            int res=n*i;
            System.out.println(n+" * "+i+" = "+res);
        }
    }

    //2. Factorial of a Number
    public static void Factorial(int n){
        System.out.println("Factorial of a Number");
        int fac=1;
        for(int i=1;i<n;i++){
            fac=fac*i;
            System.out.println("Factorial of "+n+" are: "+fac);
        }
    }

    //3.Fibonacci Series
    public static void Fibonacci(int n){
        System.out.println("Fibonacci Series: ");
        // int prev=0;
        // System.out.println(prev);

        // for(int i=1;i<=n;i++){
        //     int next=prev+i;
        //     System.out.println(next);
        //     prev=i;

        }
    }

