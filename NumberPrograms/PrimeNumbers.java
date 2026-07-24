package numberPrograms;
//1. prime numbers in a range
import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Set start range i = ");
		int m=scan.nextInt();
		System.out.print("Set end range j = ");
		int n=scan.nextInt();
		
		for(int i=m;i<n;i++) {
			int c=0;	//take as counter
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println("prime numbers: "+i);
			}
		}
		}
}
