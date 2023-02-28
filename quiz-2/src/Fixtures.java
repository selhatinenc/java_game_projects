import java.awt.*;
import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class Fixtures {
	public void fixtures(){
		
		readfixtures();
	}
	public void readfixtures() {
	
			try {
				List<String> allLines = Files.readAllLines(Paths.get("\\C:\\Users\\Enc\\eclipse-workspace\\quiz-2\\src\\fixtures.txt"));
				for (String line : allLines) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	
		
		
	}


