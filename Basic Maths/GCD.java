
/*
 * GCD of two numbers is the largest number that divides 
 both of them without leaving a remainder. 
 We iterate through all numbers from 1 up to the minimum of the two input numbers, 
 checking if each number is a common factor of both input numbers.
If a number is a common factor, we update our gcd variable to that number. 
This process continues until we have iterated through all possible common factors. 
Finally, we return the gcd variable, which will hold the greatest common divisor of the two input numbers.
 */
public class GCD {
	public static void main(String[] args) {
		int n1=55;
		int a=n1;
		int n2=24;
		int b=n2;
		int remainder=0;
		while(b!=0) {
			remainder=a%b;
			a=b;
			b=remainder;
		}
		System.out.println("GCD( "+n1+" , "+n2+" ) : "+a);
	}
}
