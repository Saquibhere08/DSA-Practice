/*
 Check if a number is Palindrome or Not
181
Problem Statement: Given an integer N, return true if it is a palindrome else return false.
A palindrome is a number that reads the same backward as forward. 
For example, 121, 1331, and 4554 are palindromes because they
 remain the same when their digits are reversed.
 */

public class Plaindrome {
	public static void main(String[] args) {
		int m=0;
		int n=121;
		int temp=n;
        while(n>0){
           int p=n%10;
           m=m*10+p;
           n=n/10;
        }
        System.out.println("original: "+temp);
        System.out.println("reversed: "+m);
        if(temp==m){
            System.out.println(m+" is Palindrome");
        }else{
        System.out.println(m+" not a Palindrome");
        }
	}
}
