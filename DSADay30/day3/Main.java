package DSADay30.day3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        MultiplicationTable(n);
        Factorial(n);
        // Fibonacci(n);
        prime(n);
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
        //4. Prime Number
        public static void prime(int n){
            System.out.println("Prime Numbers");
            int count=0;
            for(int i=1;i*i<=n;i++){
                if(n%i==0){
                    count++;
                }
                if(n/i!=i){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Prime Number: "+n);
            }else{
                System.out.println("Not a Prime Number: "+n);
            }
            
        }
    }

