package basics.conditionalStatments;
import java.util.Scanner;
public class conditionalStatementsExample {
    
    public static void conditionalStatementsExample1(int age){
        System.out.println("if statements");
        if(age>=18){
            System.out.println("Adult");
        }
    }
    public static void conditionalStatementsExample2(int age){
        System.out.println("if-else statments");
        if(age>=18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }
    }
    public static void conditionalStatementsExample3(int age){
        System.out.println("else-if ladder statements");
        if(age>18){
            System.out.println("Adult");
        }else if(age==18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }
    }

    public static void conditionalStatementsExample4(Scanner sc){
        System.out.println("Switch Statements");
        System.out.println("Enter your input (1-3)");
        int inp=sc.nextInt();
        switch (inp) {
            case 1: System.out.println("Hello");
                break;
            case 2: System.out.println("Namaste");
                break;
            case 3: System.out.println("Bonjour");
                break;
            default: System.out.println("Invalid input");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age=sc.nextInt();
        conditionalStatementsExample1(age);
        conditionalStatementsExample2(age);
        conditionalStatementsExample3(age);
        conditionalStatementsExample4(sc);
    }
}
