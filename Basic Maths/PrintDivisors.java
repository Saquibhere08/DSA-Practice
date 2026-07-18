import java.util.Scanner;

public class PrintDivisors {
    public static void checkDiv(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0)
            System.out.println(i);

        }
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);    //userInput
        System.out.print("Enter Number: ");
        int n=scan.nextInt();
        System.out.println("Divisors of "+n+" are: ");
        checkDiv(n);
    }   
}
