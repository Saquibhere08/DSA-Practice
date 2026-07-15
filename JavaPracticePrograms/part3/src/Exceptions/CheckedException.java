package Exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) {
		createFile();
	}
	public static void createFile() {
		try {
			FileWriter fw=new FileWriter("Java.txt");
		} catch (IOException e) {
			System.out.println("Handled...");
		}
		System.out.println("File Created....");
	}
}
