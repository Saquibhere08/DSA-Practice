package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
//write to a file
public class WriteFileExample {
	public static void main(String[] args) {
		try {
			FileWriter f=new FileWriter("a.txt");
			f.write("This is my first file. I want to learn File Handling");
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to write/read the file");
			e.printStackTrace();
		}
	}
}
