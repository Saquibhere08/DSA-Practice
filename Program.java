import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program{
    //Problem: 
    //if the same word appears again later a different word, 
    // it should be treated as a new group

        //input 1: "apple,apple,banana,banana,apple,apple"
        //output : [("apple",3),("banana",3),("apple",2)]

        //input2: "cat,cat,dog,dog,fish,fish,fish,fish"
        //output: [("cat",3),("dog",2),("fish",4)]
        

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String input1 = "apple,apapple,banana,banana,apple,apple";
        // String input2 = "cat,cat,dog,dog,fish,fish,fish,fish";
        System.out.println("Enter input1: ");
        String input1=sc.nextLine();
        System.out.println("Enter input2: ");
        String input2 = sc.nextLine();


        System.out.println("output: ");
        System.out.println(groupWords(input1));
        System.out.println(groupWords(input2));
    }
    

    public static List<Pair> groupWords(String input) {

        String[] w = input.split(",");
        List<Pair> rs = new ArrayList<>();

        String cur = w[0];
        int count = 1;

        for (int i = 1; i < w.length; i++) {

            if (w[i].equals(cur)) {
                count++;
            } else {
                rs.add(new Pair(cur, count));
                cur = w[i];
                count = 1;
            }
        }

        rs.add(new Pair(cur, count));
        return rs;
    }

    
}

