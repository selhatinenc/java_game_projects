import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JList;

import java.util.Iterator;
 	

public class Voleyball  


{
	String[][] str;
	
	String team1="1";
	int team1numberofmatcheswon=0;
	int team1numberofeven=0;
	int team1numberofloss=0;
	int team1scored=0;
	int team1conceded=0;
	int team1totalpoints=0;
	
	
	
	String team2="2";
	int team2numberofmatcheswon=0;
	int team2numberofeven=0;
	int team2numberofloss=0;
	int team2scored=0;
	int team2conceded=0;
	int team2totalpoints=0;
	
	
	
	String team3="3";	
	int team3numberofmatcheswon=0;
	int team3numberofeven=0;
	int team3numberofloss=0;
	int team3scored=0;
	int team3conceded=0;
	int team3totalpoints=0;
	
	
	String team4="4";
	int team4numberofmatcheswon=0;
	int team4numberofeven=0;
	int team4numberofloss=0;
	int team4scored=0;
	int team4conceded=0;
	int team4totalpoints=0;
	
	
	
	List<String> volleyball;
	public void volleyball(List<String> volleyball) {
		this.volleyball=volleyball;
		
		arrange();
		output();
		sortlist();
		sortlist();
		avaragefixed();
		
		
		avaragefixed();
		filewriter();
		
		
		
		
	}
	void arrange() {
	
	for(String line:volleyball) {
		
		
		
		System.out.println(line);
		
		
		
		String[] lines=line.trim().split("\t");
		String firstteam=lines[1];
		String secondteam=lines[2];
		String[] soccermatch=lines[3].trim().split(":");
		
		
		int firstteamsoccer=Integer.valueOf(soccermatch[0]);
		int secondteamsoccer=Integer.valueOf(soccermatch[1]);
		
		if(firstteam.equals("Eczacibasi")){
			team1scored=team1scored+firstteamsoccer;
			team1conceded=team1conceded+secondteamsoccer;
		
			if(firstteamsoccer>secondteamsoccer) {
				
				team1numberofmatcheswon +=1;
				if(firstteamsoccer-secondteamsoccer>1){
					team1totalpoints+=3;
					
				}
				if(firstteamsoccer-secondteamsoccer==1){
					team1totalpoints+=2;
				}
					
				}
				
				
		
			else if(firstteamsoccer<secondteamsoccer) {
				team1numberofloss+=1;
				if(firstteamsoccer==2)
					{team1totalpoints+=1;
					}
				

			
			}
			
		}
		if(firstteam.equals("Vakifbank")){
			team2scored=team2scored+firstteamsoccer;
					
			team2conceded=team2conceded+secondteamsoccer;
		

		
		
			if(firstteamsoccer>secondteamsoccer) {
				
				team2numberofmatcheswon +=1;
				if(firstteamsoccer-secondteamsoccer>1){
					team2totalpoints+=3;
					
				}
				if(firstteamsoccer-secondteamsoccer==1){
					team2totalpoints+=2;
				}
				
					
				}
				
		
			else if(firstteamsoccer<secondteamsoccer) {
				team2numberofloss+=1;
				if(firstteamsoccer==2)
					{team2totalpoints+=1;
					}
				

			
			}
			
		}
		
		if(firstteam.equals("Fenerbahce")){
			team3scored=team3scored+firstteamsoccer;
					
			team3conceded=team3conceded+secondteamsoccer;
		

		
		
			if(firstteamsoccer>secondteamsoccer) {
				
				team3numberofmatcheswon +=1;
				if(firstteamsoccer-secondteamsoccer>1){
					team3totalpoints+=3;
					
				}
				if(firstteamsoccer-secondteamsoccer==1){
					team3totalpoints+=2;
				}
				
					
				}
				
		
			else if(firstteamsoccer<secondteamsoccer) {
				team3numberofloss+=1;
				if(firstteamsoccer==2)
					{team3totalpoints+=1;
					}
				

			
			}
			
		}
		if(firstteam.equals("Galatasaray")){
			team4scored=team4scored+firstteamsoccer;
					
			team4conceded=team4conceded+secondteamsoccer;
		

		
		
			if(firstteamsoccer>secondteamsoccer) {
				
				team4numberofmatcheswon +=1;
				if(firstteamsoccer-secondteamsoccer>1){
					team4totalpoints+=3;
					
				}
				if(firstteamsoccer-secondteamsoccer==1){
					team4totalpoints+=2;
				}
					
				}
				
				
		
			else if(firstteamsoccer<secondteamsoccer) {
				team4numberofloss+=1;
				if(firstteamsoccer==2)
					{team4totalpoints+=1;
					}
				

			
			}
			
		}
		if(secondteam.equals("Eczacibasi")){
			team1scored=team1scored+secondteamsoccer;
			
			team1conceded=team1conceded+firstteamsoccer;

			
			if(firstteamsoccer<secondteamsoccer) {
				team1numberofmatcheswon +=1;
				if(firstteamsoccer==2) {
					
					team1totalpoints+=2;
				}
				
				
				else {
					team1totalpoints+=3;
					
				}

			}
			
			
			else if(firstteamsoccer>secondteamsoccer) {
				team1numberofloss+=1;
				if(secondteamsoccer==2) {
					team1totalpoints+=1;
					
				}


			
			}
			
			
		}
		if(secondteam.equals("Vakifbank")){
			team2scored=team2scored+secondteamsoccer;
			
			team2conceded=team2conceded+firstteamsoccer;

			
			if(firstteamsoccer<secondteamsoccer) {
				team2numberofmatcheswon +=1;
				if(firstteamsoccer==2) {
					
					team2totalpoints+=2;
				}
				
				
				else {
					team2totalpoints+=3;
					
				}

			}
			
			
			else if(firstteamsoccer>secondteamsoccer) {
				team2numberofloss+=1;
				if(secondteamsoccer==2) {
					team2totalpoints+=1;
					
				}


			
			}
			
			
		}
	
		if(secondteam.equals("Fenerbahce")){
			team3scored=team3scored+secondteamsoccer;
			
			team3conceded=team3conceded+firstteamsoccer;

			
			if(firstteamsoccer<secondteamsoccer) {
				team3numberofmatcheswon +=1;
				if(firstteamsoccer==2) {
					
					team3totalpoints+=2;
				}
				
				
				else {
					team3totalpoints+=3;
					
				}

			}
			
			
			else if(firstteamsoccer>secondteamsoccer) {
				team3numberofloss+=1;
				if(secondteamsoccer==2) {
					team3totalpoints+=1;
					
				}


			
			}
			
			
		}
		if(secondteam.equals("Galatasaray")){
			team4scored=team4scored+secondteamsoccer;
			
			team4conceded=team4conceded+firstteamsoccer;

			
			if(firstteamsoccer<secondteamsoccer) {
				team4numberofmatcheswon +=1;
				if(firstteamsoccer==2) {
					
					team4totalpoints+=2;
				}
				
				
				else {
					team4totalpoints+=3;
					
				}

			}
			
			
			else if(firstteamsoccer>secondteamsoccer) {
				team4numberofloss+=1;
				if(secondteamsoccer==2) {
					team4totalpoints+=1;
					
				}


			
			}
			
			
		}
		}


		
	
	}
	
void output() {
		
	
		
		str=new String[5][3];
		  for(int k=4;k>0;k--) {
			  if(k==4) {	
				  str[k][0]=String.valueOf(team1totalpoints);
				str[k][1]="team1";
				str[k][2]=String.valueOf( team1scored-team1conceded);
				k--;
				
				  
				  
			  }
			  if(k==3) {
					str[k][0]=String.valueOf( team2totalpoints);
					str[k][1]="team2";
					str[k][2]=String.valueOf( team2scored-team2conceded);
					k--;
					  
				  
			  }
			  if(k==2) {
					str[k][0]=String.valueOf( team3totalpoints);
					str[k][1]="team3";
					str[k][2]=String.valueOf( team3scored-team3conceded);
					k--;
					
				}
				  
			  
			  if(k==1) {
				  
					str[k][0]=String.valueOf( team4totalpoints);
					str[k][1]="team4";

					str[k][2]=String.valueOf( team4scored-team4conceded);
					k--;
			  }
				  

		  
		  }
		
		
			  
		  }
void sortlist() {
	for(int i=1;i<5;i++) {

		for(int j=i+1;j<5;j++) {
			int	ipoint=Integer.parseInt(str[i][0]);
			int	jpoint=Integer.parseInt(str[j][0]);
			if(ipoint<jpoint) {
				str[0][0]=str[i][0];
				str[0][1]=str[i][1];
				str[0][2]=str[i][2];
				
				str[i][0]=str[j][0];
				str[i][1]=str[j][1];
				str[i][2]=str[j][2];
				
				str[j][0]=str[0][0];
				str[j][1]=str[0][1];
				str[j][2]=str[0][2];
				
				
				
				
			}
			
			
			
		
		
		
		}}
		}
			
	void avaragefixed() {
		
		for(int i=1;i<5;i++) {

			for(int j=i+1;j<5;j++) {
				if(! str[i][1].equals(str[j][1])) {
					if(str[i][0].equals(str[j][0])) {
					int	avaragei=Integer.parseInt(str[i][2]);
					int	avaragej=Integer.parseInt(str[j][2]);
					
					if(avaragei<avaragej) {
						
						str[0][0]=str[i][0];
						str[0][1]=str[i][1];
						str[0][2]=str[i][2];
						
						str[i][0]=str[j][0];
						str[i][1]=str[j][1];
						str[i][2]=str[j][2];
						
						str[j][0]=str[0][0];
						str[j][1]=str[0][1];
						str[j][2]=str[0][2];
						
						
						
						

						
						
					}
					else if(avaragei==avaragej) {
					     String[ ] names = {str[i][1],str[j][1]};
			             sortStringBubble (names);
			             if(names[0]==str[j][1]) {
			            	 	str[0][0]=str[i][0];
								str[0][1]=str[i][1];
								str[0][2]=str[i][2];
								
								str[i][0]=str[j][0];
								str[i][1]=str[j][1];
								str[i][2]=str[j][2];
								
								str[j][0]=str[0][0];
								str[j][1]=str[0][1];
								str[j][2]=str[0][2];
								
			            	 
			            	 }
			             }
						
					}
				}
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	void filewriter() {
		try {
			FileWriter filewriter=new FileWriter(new File("volleyball.txt"));
			
			for(int k=1;k<5;k++) {
				
				
				System.out.println(str[k][0]+"  "+str[k][1]+"  "+str[k][2]);
				if(str[k][1].equals("team1")) {
					filewriter.write(k+".	 "+" Eczacibasi 	"+
				(team1numberofeven+team1numberofloss+team1numberofmatcheswon)+"\t"+team1numberofmatcheswon+"\t"+team1numberofeven+"\t"+
							team1numberofloss+"\t"+team1scored+":"+team1conceded+"\t"+team1totalpoints+"	\n"
							);
					
					
					
				}
				
				if(str[k][1].equals("team2")) {
					filewriter.write(k+".	 "+" Vakifbank 	"+
				(team2numberofeven+team2numberofloss+team2numberofmatcheswon)+"\t"+team2numberofmatcheswon+"\t"+team2numberofeven+"\t"+
							team2numberofloss+"\t"+team2scored+":"+team2conceded+"\t"+team2totalpoints+"	\n"
							);
					
					
					
				}
				if(str[k][1].equals("team3")) {
					filewriter.write(k+".	 "+" Fenerbahce 	"+
				(team3numberofeven+team3numberofloss+team3numberofmatcheswon)+"\t"+team3numberofmatcheswon+"\t"+team3numberofeven+"\t"+
							team3numberofloss+"\t"+team3scored+":"+team3conceded+"\t"+team3totalpoints+"	\n"
							);
					
					
					
				}
				if(str[k][1].equals("team4")) {
					filewriter.write(k+".	 "+" Galatasaray 	"+
				(team4numberofeven+team4numberofloss+team4numberofmatcheswon)+"\t"+team4numberofmatcheswon+"\t"+team4numberofeven+"\t"+
							team4numberofloss+"\t"+team4scored+":"+team4conceded+"\t"+team4totalpoints+" 	 \n"
							);
					
					
					
				}
				
				
				
				
			}
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	 public static void sortStringBubble( String  x [ ] )
     {
           int j;
           boolean flag = true;  // will determine when the sort is finished
           String temp;

           while ( flag )
           {
                 flag = false;
                 for ( j = 0;  j < x.length - 1;  j++ )
                 {
                         if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 )
                         {                                             // ascending sort
                                     temp = x [ j ];
                                     x [ j ] = x [ j+1];     // swapping
                                     x [ j+1] = temp;
                                     flag = true;
                          }
                  }
           }
     }
	
}
		
