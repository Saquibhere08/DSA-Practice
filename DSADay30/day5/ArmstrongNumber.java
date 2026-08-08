package DSADay30.day5;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        int temp=n;
        int res=0;
        int pw=count(n);
        // System.out.println(pw);
        while(n!=0){
            int p=n%10;
            res=res+(int)Math.pow(p, pw);   //using Math.pow();
            n=n/10;
        }
        System.out.println(res);

        if(temp==res){
            System.out.println(res+" is a Armstrong Number.");
        }else{
            System.out.println(res+" is not an Armstrong Number.");
        }

    }
    // to find out the number of digits == power of an digit
    public static int count(int n){
        int count=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        return count;
    }
}
