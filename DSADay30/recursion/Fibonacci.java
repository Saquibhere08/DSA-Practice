package recursion;
import java.util.Scanner;

// Problem 8. Given an integer N. Print the Fibonacci series up to the Nth term.
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=scan.nextInt();
        int count=0;
        int pre=0;
        int next =1;
        printFibo(n, count, pre, next);
        
    }

    public static void printFibo(int n, int count, int pre, int next) {

        if (count > n)
            return;

        System.out.print(pre + " ");

        printFibo(n, count + 1, next, pre + next);
    }
}
