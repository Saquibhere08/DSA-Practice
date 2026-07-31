package DSADay30.day2;
//1.Find Leap Years
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Check for Leap Year ");
        System.out.print("Enter year: ");
        int year=sc.nextInt();

        if(year%4==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
