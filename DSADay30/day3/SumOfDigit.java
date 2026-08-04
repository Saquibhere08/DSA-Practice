package DSADay30.day3;

import java.util.Scanner;

//5. Sum of Digit
public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("Sum of Digit");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        int res=0;
        while(n!=0){
            int m=n%10;
            res+=m;
            n=n/10;
        }
        System.out.println(res);
    }
}
