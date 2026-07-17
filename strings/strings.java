package strings;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // stringOp1();
        // stringOp2(sc);
        // stringOp3();
        // stringOp4();
        // stringOp5();
        stringOp6();
    }
    public static void stringOp1(){
        String name="Tony";
        String fullName="Saquib Bin Halim";
        String sentence = "My name is Saquib Bin Halim";

        System.out.println(name);
        System.out.println(fullName);
        System.out.println(sentence);
    }
    public static void stringOp2(Scanner sc){
        System.out.println("Enter Name: ");
        String name=sc.next();  //used to i/p (in one words)
        sc.nextLine();
        System.out.println("Enter Full Name: ");
        String fullName=sc.nextLine(); //used to take a full line (more than one word)

        System.out.println(name);
        System.out.println(fullName);
    }
    public static void stringOp3(){
        String firstName="Saquib";
        String lastName="Halim";

        //concatenation
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);
    }
    public static void stringOp4(){
        String fullName="tony stark";
        System.out.println(fullName);

        //length() - it is used to return the full length of any string
        System.out.println(fullName.length());

        //charAt() - it will return the characters present in the string one by one
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }

    public static void stringOp5(){
        /*compare
            case1. s1>s2 : +ve value
            case2. s1==s2 : 0
            case3. s1<s2 : -ve value
        */
        String name1="Tony";
        String name2="Tony";

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");

        }else{
            System.out.println("Strings are not equal");
        }

        if(name1==name2){   
            System.out.println("Strings are equal");

        }else{
            System.out.println("Strings are not equal");
        }

        //note: '==' will provide same output in this case, but 'compareTo' is preferred  because '==' fails in many cases.
    }

    public static void stringOp6(){
        String sentence = "My Name is Saquib";
        System.out.println(sentence);
        //substring(begin index, end index)
        String name=sentence.substring(3);
        System.out.println(name);
    }
}
