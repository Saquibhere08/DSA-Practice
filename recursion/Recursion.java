
package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt(); //user input
        int count=1; //counter variable
        int sum=0; //sum variable
        int fac=1;  //factorial
        int [] a={1,2,3,4,5};
        System.out.println("Problem 1");
        printName(n);    //recursion problem 1
        System.out.println("Problem 2"); 
        printNumber(n,count); //recursion problem 2
        System.out.println("Problem 3");
        printRev(n);    //recurison problem 3
        System.out.println("Problem 4");
        printSum(n,count,sum);  //recursion problem 4
        System.out.println("Problem 5");
        printFac(n,fac);
        System.out.println("Problem 6");
        System.out.println("Original Array: "+Arrays.toString(a));
        revArray(a,n);


    }
    //Problem 1. Print name N times using recursion.
    public static void printName(int n){
        int i=0;
        if(i==n)return;
        System.out.println("Saquib");
        printName(--n);
    }
    // Problem 2. Print number 1 to N
    public static void printNumber(int n,int count){
        if(count>n)return;
        System.out.println(count);
        printNumber(n,++count);
    }
    //Problem 3. Print N to 1.
    public static void printRev(int n){
        if(n==0)return;
        System.out.println(n);
        printRev(--n);
    }
    //Problem 4. Sum of First N numbers
    public static void printSum(int n,int count,int sum){
        if(count>n){
        System.out.println(sum);
        return;
        }
        sum+=count;
        printSum(n,++count, sum);
       
    }

    //Problem 5. Factorial of a Given number.
    public static void printFac(int n,int fac){
        if(n==0){
        System.out.println(fac);    
        return;
        }
        fac=fac*n;
        printFac(--n, fac);
    }
    //Problem 6. Reverse an Array
    public static void revArray(int [] a,int n){
        if(){
            System.out.println(Arrays.toString(a));
            return;
        }
        
    }
}
