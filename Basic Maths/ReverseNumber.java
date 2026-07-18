
/*
 Reverse Digits of A Number

Problem Statement: Given an integer N return the reverse of the given number.
Note: If a number has trailing zeros, then its reverse will not include them.
 For e.g , reverse of 10400 will be 401 instead of 00401.
 */
public class ReverseNumber {
	public static void main(String[] args) {
		int n=23456;
		System.out.println("Original: "+n);
		int m=0;
		while(n>0) {
			int p=n%10;
			m=m*10+p;
			n=n/10;
	}
	
		System.out.println("Reversed: "+m);
//		String s="";
//		s+=n;
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}
//		System.out.println("\n"+s);
//		StringBuilder p=new StringBuilder(s);
//		p=p.reverse();
//		s=p.toString();
//		System.out.println(s);
//	}
}
}
