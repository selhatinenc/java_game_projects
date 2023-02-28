import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	static String[] lines;
	static People people;
	static Sport sport;
	static Food food;
	static ArrayList<ArrayList<String>> personlist=new ArrayList<ArrayList<String>>();
	static FileWriter filewriter;
	static ArrayList<String> writenlist;

	public static void main(String[] args) throws IOException {
		writenlist=new ArrayList<>();
		
		try {
			filewriter=new FileWriter(new File("monitoring.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 people=new People(); // get person data from the person file
		people.people();
		
		 sport=new Sport();// get sport data from the sport file
		sport.sport();
		
		 food=new Food();// get food data from the food file
		food.food();
		
		readfile(args[0]);// read command txt
		for(int i =0;i<writenlist.size()-1;i++) filewriter.write(writenlist.get(i));
		
		
		filewriter.close();
		
	}

	
	
	private static  void readfile(String command) { // this methods reads file.  data of the file add List
		
		try {
			List<String> allLines = Files.readAllLines(Paths.get(command));
			
			for(int whilenumber=0; whilenumber<allLines.size();whilenumber++) {
				 lines=allLines.get(whilenumber).trim().split("\t");
				if(lines.length==1) {
					if(lines[0].length()==9) {
						if(lines[0].equals("printWarn")) {
							printWarn();
						}
						else if(lines[0].equals("printList")) {
							printlist();
							writenlist.add("***************\n");
						}
					}
					else {
						StringBuffer bffr=new StringBuffer(lines[0]);
						
						String personid=( bffr.delete(0, 6).deleteCharAt(5).toString());
						print(personid,"printlist");
						writenlist.add("***************\n");
					}
					
				}
				else{
					people.findpersondata(lines[0]);//people id given
					if(people.peopledata.equals("No Person")) { 
						writenlist.add("Person wasn't found");}
					else{
					int stuffid= Integer.valueOf(lines[1]);
				 if (stuffid<1500) {
					 
					food();
				
					
				}
				 else {
					 sport();
					

				}
				}
			}
			
		} }catch (IOException e) {
			e.printStackTrace();
		}
	}

private static void printWarn() throws IOException {
		// TODO Auto-generated method stub
	ArrayList<String> containlist=new ArrayList<String>();
	for (int i = 0; i < personlist.size(); i++) {
		if( !containlist.contains(personlist.get(i).get(0)) ) {
			containlist.add(personlist.get(i).get(0));
			print(personlist.get(i).get(0),"printwarn");
		}
		
	}
	}



	//	this method print one choosed person
	private static void print(String personid,String key) throws IOException { 
		// TODO Auto-generated method stub
		int burnedcalorie=0;
		int eatencalorie=0;
		String name = null;
		String age = null;
		String needcalorie = null;
		boolean personcontrol=false;
		for(int i=0;i<personlist.size();i++) {
			
				if(personlist.get(i).get(0).equals(personid)) {
					personcontrol=true;
					name=personlist.get(i).get(3);
					age=personlist.get(i).get(4);
					needcalorie=personlist.get(i).get(5);
					if(personlist.get(i).get(2).equals("food"))
					
					{	eatencalorie +=Integer.valueOf(personlist.get(i).get(1));
				
					}
					if(personlist.get(i).get(2).equals("sport")){
						burnedcalorie+=Integer.valueOf(personlist.get(i).get(1));
					}

				
				
			}
			
		}
		if(personcontrol==true) {
		int allofthem=-(Integer.valueOf(needcalorie)+burnedcalorie-eatencalorie);
		
		if(key.equals("printlist")){
				writenlist.add(name+"\t"+age+"\t"+needcalorie+"\t"+eatencalorie+"\t"+burnedcalorie+"\t"+allofthem+"\n");
		}if(key.equals("printwarn")){
			if(allofthem>0) {
				writenlist.add(name+"\t"+"has taken more than daily calorie need"+"\t calorie taken:"+eatencalorie+"\t calorie burned:"+burnedcalorie);
				writenlist.add("***************\n");

			}}
		}else {
			writenlist.add("Person wasn't found\n");

		}
		
	}
	
	
//	this methods send persons will be listed to print one by one

	private static void printlist() throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> containlist=new ArrayList<String>();
	for (int i = 0; i < personlist.size(); i++) {
		if( !containlist.contains(personlist.get(i).get(0)) ) {
			containlist.add(personlist.get(i).get(0));
			print(personlist.get(i).get(0),"printlist");
		}
		
	}
	}
//	this methods add food personslistdailycaloriens
	private static void food() throws IOException {
		 food.findfooddata(lines[1]);//fruit id given
		 ArrayList<String> personfeature = new ArrayList<String>() ;
		 people.findpersondata(lines[0]);//people id given
		 
		 String peopledata=people.peopledata;
		 String name=peopledata.split(",")[0];
		 String weight=peopledata.split(",")[1]; 
		 String height=peopledata.split(",")[2];
		 String birthday=peopledata.split(",")[3];
		 String gender=peopledata.split(",")[4];
		 
		 int age=2022-Integer.valueOf(birthday);
		 double calorieneeds=0;
		 int  roundedcolorieneeds=0;
		 if (gender.equals("female")) {
		
			  calorieneeds=(double) (665+(9.6*Integer.valueOf(weight) )+(1.7*Integer.valueOf(height) )-(4.7*age));
			   roundedcolorieneeds=(calorieneeds-(int)calorieneeds>=0.5) ? (int)calorieneeds+1:(int) calorieneeds;

		 }
		 
		 
		 else {
			  calorieneeds=(double) (66+(13.75*Integer.valueOf(weight) )+(5*Integer.valueOf(height) )-(6.8*age));
			   roundedcolorieneeds=(calorieneeds-(int)calorieneeds>=0.5) ? (int)calorieneeds+1:(int) calorieneeds;


			
		}
		 int caloriecalculated=Integer.parseInt(food.result.split(",")[1])*Integer.parseInt(lines[2]);

		 personfeature.add(lines[0]); //person id is add list
		 personfeature.add(String.valueOf(caloriecalculated) );
		 personfeature.add("food");// this is calorie added signal
		 personfeature.add(peopledata.split(",")[0]);// this is  name
		 personfeature.add(String.valueOf(age));// this is age 
		 personfeature.add(String.valueOf(roundedcolorieneeds));
		
			
		 
		 
		 personlist.add(personfeature);
		 writenlist.add(lines[0]+"	has taken	"+caloriecalculated+"kcal from\t"+food.result.split(",")[0]+"\n");
		writenlist.add("***************\n");

	}
	
//	this methods add sport to personslistdailycaloriens

	private static void sport() throws IOException {
		// TODO Auto-generated method stub
		 sport.findsportdata(lines[1]);//sport id given
		 ArrayList<String> personfeature = new ArrayList<String>() ;
		 people.findpersondata(lines[0]);//people id given
		 String peopledata=people.peopledata;
		 String name=peopledata.split(",")[0];
		 String weight=peopledata.split(",")[1]; 
		 String height=peopledata.split(",")[2];
		 String birthday=peopledata.split(",")[3];
		 String gender=peopledata.split(",")[4];
		 int age=2022-Integer.valueOf(birthday);
		 double calorieneeds=0;
		 int roundedcolorieneeds=0;
		 if (gender.equals("female")) {

			  calorieneeds=(double) (665+(9.6*Integer.valueOf(weight) )+(1.7*Integer.valueOf(height) )-(4.7*age));
			   roundedcolorieneeds=(calorieneeds-(int)calorieneeds>=0.5) ? (int)calorieneeds+1:(int) calorieneeds;


		 }
		 
		 
		 else {
			  calorieneeds=(double) (66+(13.75*Integer.valueOf(weight) )+(5*Integer.valueOf(height) )-(6.8*age));
			   roundedcolorieneeds=(calorieneeds-(int)calorieneeds>=0.5) ? (int)calorieneeds+1:(int) calorieneeds;


			
		}
		 int caloriecalculated=Integer.parseInt(sport.result.split(",")[1])*(Integer.parseInt(lines[2])/60);

		 personfeature.add(lines[0]); //person id is add list  - 0
		 personfeature.add(String.valueOf(caloriecalculated) );  
		 personfeature.add("sport");// this is calorie signal added 
		 personfeature.add(peopledata.split(",")[0]);// this is  name
		 personfeature.add(String.valueOf(age));// this is age 
		 personfeature.add(String.valueOf(roundedcolorieneeds));
		 
		 
		 personlist.add(personfeature);
		 
		 writenlist.add(lines[0]+"	has burned	"+caloriecalculated+"kcal thanks to \t"+sport.result.split(",")[0]+"\n");
		writenlist.add("***************\n");

	}

	

}
