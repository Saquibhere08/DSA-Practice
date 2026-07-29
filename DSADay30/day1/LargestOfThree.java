package DSADay30.day1;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a: ");
        int a=sc.nextInt();
        System.out.print("b: ");
        int b=sc.nextInt();
        System.out.print("c: ");
        int c=sc.nextInt();

        int largest=0;
        if(a>b&&a>c){
            largest=a;
        }else if(b>a&&b>c){
            largest=b;
        }else if(c>a&&c>b){
            largest=c;
        }

        System.out.println("Largest of 3: "+largest);
    }
}
