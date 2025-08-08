package day9;
import java.io.File;
import java.io.IOException;
public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myfile = new File("Text.txt");
			if (myfile.createNewFile()) {
				System.out.print("File Created.");
			}else
			{
				System.out.println("File already exists.");
			}
		}catch(IOException e){
			System.out.println("An Error occurred.");
			e.printStackTrace();
		}
		
	}

}
