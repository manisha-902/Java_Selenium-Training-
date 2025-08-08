package day9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("Text.txt", true));

			writer.write("Hello Everone.");
			writer.newLine();
			writer.close();

			System.out.println("File written successfully");
			
			BufferedReader reader = new BufferedReader(new FileReader("Text.txt"));
			String line;
			while((line = reader.readLine())!=null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("An Error occurred." + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				System.out.println("Error while closing the writer: " + e.getMessage());
			}
		}

	}
}

	
		