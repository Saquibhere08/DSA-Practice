package DSADay30.day2;

import java.util.Scanner;

//3. Calculator Using Swicth statements
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter operand 1: ");
        int n1=sc.nextInt();
        System.out.println("Enter operand 2: ");
        int n2=sc.nextInt();

        System.out.println("Enter Operator: ");
        String sym=sc.next();

        switch (sym) {
            case "+":  System.out.println("Output: "+(n1+n2));
                break;
            case "-":  System.out.println("Output: "+(n1-n2));
                break;
            case "/":  System.out.println("Output: "+(n1/n2));
                break;
            case "*":  System.out.println("Output: "+(n1*n2));
                break;
            case "%":  System.out.println("Output: "+(n1%n2));
                break;
            default: System.out.println("Invalid Operator");
                break;
        }
    }
}
