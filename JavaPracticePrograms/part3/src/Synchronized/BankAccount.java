package Synchronized;

public class BankAccount {
	int balance=1000;
	
	synchronized void withdraw(int amount) {
		balance =balance -amount;
		System.out.println("Balance:"+balance);
	}
}
