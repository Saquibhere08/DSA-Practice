
/*
 Count digits in a number
Problem Statement: Given an integer N, return the number of digits in N.
 */
public class CountNumber {
	public static void main(String[] args) {
		int n=12376;
		int count=0;
		while(n>0) {
			count+=1;
			n=n/10; 	//removing elements from the last
		}
		System.out.println(n+" -> "+count);
	}
}
