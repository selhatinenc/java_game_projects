import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
public class Main {
	static List<String> allLines;
	static List<String> soccer=new ArrayList<String>();
	static List<String> voleyball=new ArrayList<String>();;
	static List<String> hentball=new ArrayList<String>();;
	static List<String> basketball=new ArrayList<String>();;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		readfixtures(args[1]);
		seperate();
		Soccer soccerclass=new Soccer();
		Basketball basketclass= new Basketball();
		Hendball hentclass=new Hendball();
		Voleyball voleyclass= new Voleyball();

		soccerclass.soccer(soccer);
		basketclass.basketball(basketball);
		hentclass.hentball(hentball);
		
		voleyclass.volleyball(voleyball);

	
	
	}
	public static void readfixtures(String arg) {
		
		try {
			allLines = Files.readAllLines(Paths.get("/mnt/disk1/ogrenci/ogr/b2200356099/quiz-2/src/"+arg));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void seperate() {
		
		for (String line : allLines) {
		String[] lines=line.trim().split("");
		
		if(lines[0].equals("F")) {
			soccer.add(line);
			
			
		}
		if(lines[0].equals("V")) {
			voleyball.add(line);
			
			
		}
		if(lines[0].equals("B")) {
			basketball.add(line);
			
			
		}
		if(lines[0].equals("H")) {
			hentball.add(line);
			
			
		}

		
		}
		
	}
	
	


}
