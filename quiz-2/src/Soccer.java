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
 	

public class Soccer  


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
	
	
	
	List<String> soccer;
	public void soccer(List<String> soccer) {
		this.soccer=soccer;
		arrange();
		output();
		sortlist();
		sortlist();
		avaragefixed();
		avaragefixed();
		filewriter();
		
		
	}
	
	void arrange() {for(String line:soccer) {
		
		
		
		System.out.println(line);
		
		
		
		String[] lines=line.trim().split("\t");
		String firstteam=lines[1];
		String secondteam=lines[2];
		String[] soccermatch=lines[3].trim().split(":");
		
		
		int firstteamsoccer=Integer.valueOf(soccermatch[0]);
		int secondteamsoccer=Integer.valueOf(soccermatch[1]);
		
		if(firstteam.equals("Napoli")){
			team1scored=team1scored+firstteamsoccer;
					
			team1conceded=team1conceded+secondteamsoccer;
		

		
		
			if(firstteamsoccer>secondteamsoccer) {
				team1numberofmatcheswon +=1;
				team1totalpoints+=3;

			}
			else if(firstteamsoccer==secondteamsoccer) {
				team1numberofeven+=1;
				team1totalpoints+=1;

				
			}
			else if(firstteamsoccer<secondteamsoccer) {
				team1numberofloss+=1;


			
			}
			
		}
		if(firstteam.equals("Benfica")){
			team2scored=team2scored+firstteamsoccer;
			
			team2conceded=team2conceded+secondteamsoccer;
			if(firstteamsoccer>secondteamsoccer) {
				team2numberofmatcheswon +=1;
				team2totalpoints+=3;

			}
			else if(firstteamsoccer==secondteamsoccer) {
				team2numberofeven+=1;
				team2totalpoints+=1;

				
			}
			else if(firstteamsoccer<secondteamsoccer) {
				team2numberofloss+=1;


			
			}
			
			
			
		}
		
		if(firstteam.equals("Real Madrid")){
			team3scored=team3scored+firstteamsoccer;
			
			team3conceded=team3conceded+secondteamsoccer;
			if(firstteamsoccer>secondteamsoccer) {
				team3numberofmatcheswon +=1;
				team3totalpoints+=3;

			}
			else if(firstteamsoccer==secondteamsoccer) {
				team3numberofeven+=1;
				team3totalpoints+=1;

				
			}
			else if(firstteamsoccer<secondteamsoccer) {
				team3numberofloss+=1;


			
			}
			
			
		}
		if(firstteam.equals("Marsilya")){
			team4scored=team4scored+firstteamsoccer;
			
			team4conceded=team4conceded+secondteamsoccer;
			
			if(firstteamsoccer>secondteamsoccer) {
				team4numberofmatcheswon +=1;
				team4totalpoints+=3;

			}
			else if(firstteamsoccer==secondteamsoccer) {
				team4numberofeven+=1;
				team4totalpoints+=1;

				
			}
			else if(firstteamsoccer<secondteamsoccer) {
				team4numberofloss+=1;


			
			}
			
			
			}
		if(secondteam.equals("Napoli")){
			team1scored=team1scored+secondteamsoccer;
			
			team1conceded=team1conceded+firstteamsoccer;

			
			if(firstteamsoccer<secondteamsoccer) {
				team1numberofmatcheswon +=1;
				team1totalpoints+=3;

			}
			else if(firstteamsoccer==secondteamsoccer) {
				team1numberofeven+=1;
				team1totalpoints+=1;

				
			}
			else if(firstteamsoccer>secondteamsoccer) {
				team1numberofloss+=1;


			
			}
			
			
		}
		if(secondteam.equals("Benfica")){
			team2scored=team2scored+secondteamsoccer;
			
			team2conceded=team2conceded+firstteamsoccer;
			if(firstteamsoccer<secondteamsoccer) {
				team2numberofmatcheswon +=1;
				team2totalpoints+=3;

			}
			else if(firstteamsoccer==secondteamsoccer) {
				team2numberofeven+=1;
				team2totalpoints+=1;

				
			}
			else if(firstteamsoccer>secondteamsoccer) {
				team2numberofloss+=1;


			
			}
			
			
		}
	
		if(secondteam.equals("Real Madrid")){
			team3scored=team3scored+secondteamsoccer;
			
			team3conceded=team3conceded+firstteamsoccer;
			if(firstteamsoccer<secondteamsoccer) {
				team3numberofmatcheswon +=1;
				team3totalpoints+=3;

			}
			else if(firstteamsoccer==secondteamsoccer) {
				team3numberofeven+=1;
				team3totalpoints+=1;

				
			}
			else if(firstteamsoccer>secondteamsoccer) {
				team3numberofloss+=1;


			
			}
			
			
			
		}
		if(secondteam.equals("Marsilya")){
			team4scored=team4scored+secondteamsoccer;
			
			team4conceded=team4conceded+firstteamsoccer;

			if(firstteamsoccer<secondteamsoccer) {
				team4numberofmatcheswon +=1;
				team4totalpoints+=3;

			}
			else if(firstteamsoccer==secondteamsoccer) {
				team4numberofeven+=1;
				team4totalpoints+=1;

				
			}
			else if(firstteamsoccer>secondteamsoccer) {
				team4numberofloss+=1;


			
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
			FileWriter filewriter=new FileWriter(new File("football.txt"));
			
			for(int k=1;k<5;k++) {
				
				
				System.out.println(str[k][0]+"  "+str[k][1]+"  "+str[k][2]);
				if(str[k][1].equals("team1")) {
					filewriter.write(k+".	 "+" Napoli 	"+
				(team1numberofeven+team1numberofloss+team1numberofmatcheswon)+"\t"+team1numberofmatcheswon+"\t"+team1numberofeven+"\t"+
							team1numberofloss+"\t"+team1scored+":"+team1conceded+"\t"+team1totalpoints+"	\n"
							);
					
					
					
				}
				
				if(str[k][1].equals("team2")) {
					filewriter.write(k+".	 "+" Benfica 	"+
				(team2numberofeven+team2numberofloss+team2numberofmatcheswon)+"\t"+team2numberofmatcheswon+"\t"+team2numberofeven+"\t"+
							team2numberofloss+"\t"+team2scored+":"+team2conceded+"\t"+team2totalpoints+"	\n"
							);
					
					
					
				}
				if(str[k][1].equals("team3")) {
					filewriter.write(k+".	 "+" Real Madrid 	"+
				(team3numberofeven+team3numberofloss+team3numberofmatcheswon)+"\t"+team3numberofmatcheswon+"\t"+team3numberofeven+"\t"+
							team3numberofloss+"\t"+team3scored+":"+team3conceded+"\t"+team3totalpoints+"	\n"
							);
					
					
					
				}
				if(str[k][1].equals("team4")) {
					filewriter.write(k+".	 "+" Marsilya 	"+
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
		
