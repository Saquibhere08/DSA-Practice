package DSADay30.basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal value: ");
        int p = sc.nextInt();

        System.out.print("Enter Time: ");
        int t = sc.nextInt();

        System.out.print("Enter Rate: ");
        int r = sc.nextInt();
        System.out.println("Simple Interest: " + calculate(p, t, r));
    }

    static int calculate(int p, int t, int r) {
        return (p * t * r) / 100;
    }
}
