package DSADay30.day2;
//4. Check Vowel or Consonet
import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Letter: ");
        char letter=Character.toLowerCase(sc.next().charAt(0));
        
        
        switch (letter) {
            case 'a':   System.out.println("Vowel");
                break;
            case 'e':   System.out.println("Vowel");
                break;
            case 'i':   System.out.println("Vowel");
                break;
            case 'o':   System.out.println("Vowel");
                break;
            case 'u':   System.out.println("Vowel");
                break;
            default: {

                if(letter>='a' && letter<='z'){
                    System.out.println("Consonet");
                }else{
                    System.out.println("Invalid Input");
                }    
                break;
        }
    }
    }
}
