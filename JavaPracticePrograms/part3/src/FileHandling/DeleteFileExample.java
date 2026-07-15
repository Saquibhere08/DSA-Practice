package FileHandling;

import java.io.File;
//Delete the file
public class DeleteFileExample {
    public static void main(String[] args) {
        File f=new File("a.txt");
        //f.delete();

        if(f.delete()){
            System.out.println("File Deleted.");
        }
        else{
            System.out.println("Files not deleted..");
        }
        
    }
}
