package strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str=scan.next();
        Main ob=new Main();
        asscessStr1(str);
        System.out.println("Length: "+ob.asscessStr2(str));
    }

    public static void asscessStr1(String str){
        //strings, index starts from 0th-index
        //accessing / iterate through each and every element
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }

    public int asscessStr2(String str){
        //strings, index starts from 0th-index
        //finding the length of string

        return str.length();
        
}
}

