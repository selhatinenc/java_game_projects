import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String in = "path";
		ArrayList<Integer> array;
	
			File file=new File("operation.txt");
			array=new ArrayList<Integer>();
			Scanner input;
			try {
				input = new Scanner(file.getCanonicalPath());
				in=input.nextLine();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			FileReader filereader=new FileReader("C:\\Users\\Enc\\eclipse-workspace\\quiz-1\\operation.txt");
			int  filedata=filereader.read();
			while (filedata!=-1) {
				System.out.println((char)filedata);
				array.add((int)filedata);
			} 
		
			
}
}