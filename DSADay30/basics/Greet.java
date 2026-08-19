package DSADay30.basics;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();

        // greet Message
        System.out.println("Hello " + name + " ,welcome to Java Programming");
    }
}
