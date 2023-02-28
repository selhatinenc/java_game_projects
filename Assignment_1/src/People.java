import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class People {
	static List<String> allLines;
	public String[][] listofpeople;
	public String peopledata;
	

	public void people() {
		
		readfile();
		
		
			
		}
	
		
		
	
  void readfile() {
		
		try {
			
			allLines = Files.readAllLines(Paths.get("people.txt"));
			listofpeople=new String[allLines.size()][6];

			int whilenumber=0;
			while(whilenumber<allLines.size()) {
				String[] lines=allLines.get(whilenumber).trim().split("\t");
				listofpeople[whilenumber][0]=lines[0];//id
				listofpeople[whilenumber][1]=lines[1];// name
				listofpeople[whilenumber][2]=lines[2];//gender
				listofpeople[whilenumber][3]=lines[3];//weight
				listofpeople[whilenumber][4]=lines[4];//height
				listofpeople[whilenumber][5]=lines[5];//birth day

				
				
				whilenumber++;
			
		} }catch (IOException e) {
			e.printStackTrace();
		}
	}
 public void findpersondata(String peopleid) {
	  
	  int whilenumber=0;
	  Boolean controlpersonboolean=false;
		while(whilenumber<listofpeople.length) {  
			if (peopleid.equals(listofpeople[whilenumber][0])) {
				controlpersonboolean=true;
				 String height = listofpeople[whilenumber][4];;
				 String weight = listofpeople[whilenumber][3];;
				 String name = listofpeople[whilenumber][1];;
				 String birthday = listofpeople[whilenumber][5];;
				 String gender=listofpeople[whilenumber][2];;
 				 peopledata=name+","+weight+","+height+","+birthday+","+gender;
					
			

			
			
		}
	         whilenumber++;

		 
		
		
	  
  }
   	if(controlpersonboolean==false)
		peopledata="No Person";
}
}