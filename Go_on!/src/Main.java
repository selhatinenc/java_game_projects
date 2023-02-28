
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

public class Main {
	
	public static void main(String[] args) throws IOException  {
		
//		 Max max =new Max();	 System.out.println(max.maximum(1,2, 2));
//		 Stack<Integer> stackint=new Stack<Integer>();
//		 WhichConstructor wc = new WhichConstructor("test"); 
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(new
					 File("test.out"),"rw");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
				 raf.writeBytes("BBM 102"); 
				 raf.writeBytes(" Introduction to Programming"); 
				 raf.seek(8); 
				 raf.writeBytes("Advanced Programming "); 
				 raf.writeBytes("Class II "); 
				 raf.seek(16); 
				byte[] bytes = new byte[5]; 
				 raf.read(bytes); 
				 String str = new String(bytes); 
				 System.out.println(str); 
				long length = raf.length(); 
				 raf.setLength(length + 1); 
				 raf.seek(raf.length()); 
				 raf.writeBytes("is great!"); 
				 raf.close();
	}}