package workingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// createFile();
		// getFileInfo();	
		readFile();
		writeFile();
		readFile();
		}
	
	
	public static void createFile() {
		File file = new File("C:\\*\*\\*\\NewFile\\students.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("File is created.");
			}else {
				System.out.println("File already exist.");
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void getFileInfo() {
		File file = new File("C:\\*\\*\\*\NewFile\\students.txt");
		if(file.exists()) {
			System.out.println("File name: " + file.getName());
			System.out.println("File path: " + file.getAbsolutePath());
			System.out.println("File can read ? " + file.canRead());
			System.out.println("File can write ? " + file.canWrite());
			System.out.println("File size: " + file.length());
		}
	}
	
	public static void readFile() {
		File file = new File("C:\\*\\*\\*\\NewFile\\students.txt");
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public static void writeFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\\\*\\\*\\\\*\\\\NewFile\\\\students.txt",true));
			writer.newLine();
			writer.write("Turkey");
			System.out.println("Writed to file");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
