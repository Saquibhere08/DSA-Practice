package OOPs;
//Not Completed.
import java.util.Scanner;

public class BankingSystem {
	private double bal;

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=============Banking System==================");
		System.out.println("1.Add Money\n2.Check Balance");
		int ch=sc.nextInt();
		BankingSystem bk=new BankingSystem();
		bk.userInput(ch,sc);
		}
	public int userInput(int ch,Scanner sc) {

		BankingSystem bk=new BankingSystem();
		switch(ch){
			case 1: 
			{
			System.out.println("Enter Amount: ");
			double salary=sc.nextDouble();
			bk.setBal(salary);
			System.out.println("Amount: "+salary);
			return ch;
			}
			case 2:{
				System.out.println("Balance: "+bk.getBal());
				break;
			}
	}
		return  -1;
	}
}


