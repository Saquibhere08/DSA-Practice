import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Checking Prime Numbers");
        System.out.println("Enter Number: ");
        int n=scan.nextInt();
        checkPR(n);
}
    public static void checkPR(int n){
        int temp=n;
        int count=0;
        for(int i=1;i*i<=n;i++){ //using Sqrt(N) method
            if(n%i==0){
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }

        if(count==2){
            System.out.println(temp+" Prime Number");
        }else
            System.out.println(temp+" Not a Prime Number");
    }
}
