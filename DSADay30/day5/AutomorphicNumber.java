package DSADay30.day5;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        int temp=n;
        int sq=n*n;

        while(n!=0){

            if(n%10 != sq%10){
                System.out.println("N: "+n);
                System.out.println("Square N: "+sq);
                System.out.println(temp+" is Not a Automorphic Number");
            }else{
                System.out.println("N: "+n);
                System.out.println("Square N: "+sq);
                System.out.println(temp+" is Automorphic Number");
            }
            sq=sq/10;
            n=n/10;
        }
    }   
}
