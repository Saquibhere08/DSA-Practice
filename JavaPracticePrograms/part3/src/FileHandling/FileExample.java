package FileHandling;

import java.io.File;
import java.io.IOException;
//code to create a new file
public class FileExample {
	public static void main(String[] args) {
		File f=new File("a.txt");	//a.txt -> name of the file
		
		try {
			f.createNewFile();	//code to create a new file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to create file");
			e.printStackTrace();
		}
		
		
	}
}
