package DSADay30.day2;
//2. Grade Calculator
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks=sc.nextInt();

        if(marks>=80){
            System.out.println('A');
        }else if(marks>=60){
            System.out.println('B');
        }else if(marks>=40){
            System.out.println('C');
        }else if(marks>=33){
            System.out.println('D');
        }else{
            System.out.println("Fail");
        }
    }
}
