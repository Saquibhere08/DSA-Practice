package recursion;
//Problem 7. Given a string, check if the string is palindrome or not. A string is said to be palindrome if the reverse of the string is the same as the string.
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        //taking userInput
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=scan.next();
        int i=0;
        checkP(str,i);
        
       
    }
    public static void checkP(String str,int i){
        if(i >= str.length()/2){    //after iterating half og the string we will know it is a palindrome or not
            System.out.println("Palindrome");
        return;
        }
        if(str.charAt(i)!=str.charAt(str.length() - 1 - i)) {   //if the first and the last index of the string is not same, it is not a palindrome
            System.out.println("Not a Palindrome");
        return;
        }

        if(str.charAt(i)==str.charAt(str.length() - 1 - i)){    //after checking, if the first and last index of the string is same tha, it is a palindrome
            checkP(str, i+1);
        }         
    }
}