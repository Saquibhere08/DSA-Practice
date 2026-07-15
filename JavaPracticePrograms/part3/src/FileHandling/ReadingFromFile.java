package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Read from a File
public class ReadingFromFile {
    public static void main(String[] args) {
        File f=new File("a.txt");
        try  {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String fi=sc.nextLine();
                System.out.println(fi);
            }
            sc.close();
        } catch (FileNotFoundException e) {
  
            System.out.println("Unable to read from a file");
            e.printStackTrace();
        }
    }
}
