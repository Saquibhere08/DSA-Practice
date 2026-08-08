package DSADay30.day5;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        checkPalindromeNumber(0, sc);
        checkPalindromeString(null, sc);
        reverseString(null, sc);
    }
    public static void checkPalindromeNumber(int n,Scanner sc){
        System.out.println("Enter N: ");
        n=sc.nextInt();
        int temp=n;
        int res=0;
        while(n!=0){
            int p=n%10;
            res=res*10+p;
            n=n/10;

        }

        if(temp==res){
            System.out.println(res+" is a Palindrome Number.");
        }else{
            System.out.println(res+" is not a Palindrome Number.");
        }
    }

    public static void checkPalindromeString(String str,Scanner sc){
        System.out.println("Enter Str: ");
        str=sc.next().toLowerCase();    //reads string in lower-case
        String temp=str;
        int left=0;
        int right=str.length()-1;

        boolean isPalindrome=true;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                isPalindrome=false;
            }
            left++;
            right--;
        }
        if(isPalindrome==true){
            System.out.println(temp+" is a Palindrome String.");
        }else{
            System.out.println(temp+" is not a Palindrome String.");
        }
    }

    public static void reverseString(String str,Scanner sc){
        System.out.println("Enter Str: ");
        str=sc.next().toLowerCase();

        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(rev+ " is a Palindrome String.");
        }else{
            System.out.println(rev+" is not a Palindrome String.");
        }
    }


}
