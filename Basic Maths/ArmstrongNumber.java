import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Cheking Armstrong Number");
		System.out.println("Enter your Number: ");
		int number=sc.nextInt();
		checkArmstrongNumber(number);
		

}
	public static void checkArmstrongNumber(int number){
		int original=number;
		int lastDigit=0;
		int sum=0;
		while(number>0){
			lastDigit=number%10;
			sum+=(lastDigit*lastDigit*lastDigit);
			number=number/10;
		}
		System.out.println("Input: "+original);
		System.out.println("Output: "+sum);
		if(original==sum){
			System.out.println(original+" is a Armstrong Numbers");
		}else
			System.out.println("Not an Armstrong Number");
	}
}


