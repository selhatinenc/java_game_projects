import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.Border;
public class Main {

	public static void main (String[] args) {

		new Sone();
		
		
		
	
	}
	
	}	
	

 

/*
 * 
 * 
		JOptionPane pane=new JOptionPane();
		pane.showMessageDialog(null, "GO CODE!!!");

		TextField textfield= new TextField("Here is some useless info \n dont care it!");
		textfield.setPreferredSize(new Dimension(250,40));
		textfield.setForeground(new Color(0x475FF2));
		textfield.setBackground(new Color(0xAB26579));
		textfield.setCaretPosition(4);
		textfield.getColorModel();
		
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0xFAC231));
		frame.setLayout(new GridLayout(3,3,3,3));
		frame.setSize(250, 250);
		
		frame.add(textfield);
		
		
		
		
 JComboBox comboBox;
 
 MyFrame(){
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setLayout(new FlowLayout()); 
  
  String[] animals = {"dog","cat","bird"};
  
  comboBox = new JComboBox(animals);
  comboBox.addActionListener(this);
  
  //comboBox.setEditable(true);
  //System.out.println(comboBox.getItemCount());
  //comboBox.addItem("horse");
  //comboBox.insertItemAt("pig", 0);
  //comboBox.setSelectedIndex(0);
  //comboBox.removeItem("cat");
  //comboBox.removeItemAt(0);
  //comboBox.removeAllItems();
  
  this.add(comboBox);
  this.pack();
  this.setVisible(true);
 }
 
 @Override
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==comboBox) {
   System.out.println(comboBox.getSelectedItem());
   //System.out.println(comboBox.getSelectedIndex());
 * 
 * 
 *	frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0xFAC231));
		frame.setLayout(new GridLayout(3,3,3,3));
		frame.setSize(250, 250);
 *
		 	JLabel label= new JLabel();
				ImageIcon image=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/btc.png");
				Border border= BorderFactory.createLineBorder(Color.red, 3);
				label.setText("BITCOIN:36,743$");
				label.setIcon(image);
				label.setIconTextGap(10);
				label.setForeground(Color.YELLOW);
				label.setFont(new Font("MV Boli",Font.PLAIN,25));
				label.setVerticalTextPosition(JLabel.BOTTOM);
				label.setHorizontalTextPosition(JLabel.CENTER);
				JPanel panel= new JPanel();
				panel.setBackground(Color.white);
				panel.add(label);
				
				
				
				/// second one ETherium
				
				JLabel label2= new JLabel();
				ImageIcon image2=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/Eth.png");
				Border border2= BorderFactory.createLineBorder(Color.BLACK,1);
				label2.setText("Etherium");
				label2.setIcon(image2);
				label2.setIconTextGap(1);
				label2.setForeground(Color.BLACK);
				label2.setFont(new Font("MV Boli",Font.PLAIN,25));
				label2.setVerticalTextPosition(JLabel.BOTTOM);
				label2.setHorizontalTextPosition(JLabel.CENTER);
				JPanel panel2= new JPanel();
				panel2.setBackground(Color.WHITE);
				panel2.add(label2);
				
				/// third one USTD
				
				JLabel label3= new JLabel();
				ImageIcon image3=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/luna.jpg");
				Border border3= BorderFactory.createLineBorder(Color.green, 3);
				label3.setText("BITCOIN");
				label3.setIcon(image3);
				label3.setIconTextGap(-10);
				label3.setForeground(Color.YELLOW);
				label3.setFont(new Font("MV Boli",Font.PLAIN,25));
				label3.setVerticalTextPosition(JLabel.BOTTOM);
				label3.setHorizontalTextPosition(JLabel.CENTER);
				JPanel panel3= new JPanel();
				panel3.setBackground(Color.white);
				panel3.add(label3);
				/// xrp
				JLabel label4= new JLabel();
				ImageIcon image4=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/xrp.jpg");
				Border border4= BorderFactory.createLineBorder(Color.green, 3);
				label4.setText("BITCOIN");
				label4.setIcon(image4);
				label4.setIconTextGap(-10);
				label4.setForeground(Color.YELLOW);
				label4.setFont(new Font("MV Boli",Font.PLAIN,25));
				label4.setVerticalTextPosition(JLabel.BOTTOM);
				label4.setHorizontalTextPosition(JLabel.CENTER);
				JPanel panel4= new JPanel();
				panel4.setBackground(Color.white);
				panel4.add(label4);
				///doge 
				JLabel label5= new JLabel();
				ImageIcon image5=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/doge.jpg");
				Border border5= BorderFactory.createLineBorder(Color.green, 3);
				label5.setText("DOGE");
				label5.setIcon(image5);
				label5.setIconTextGap(-10);
				label5.setForeground(Color.YELLOW);
				label5.setFont(new Font("MV Boli",Font.PLAIN,25));
				label5.setVerticalTextPosition(JLabel.BOTTOM);
				label5.setHorizontalTextPosition(JLabel.CENTER);
				
				JPanel panel5= new JPanel();
				
				panel5.setBackground(Color.white);
				panel5.add(label5);
				///bnb
				
				JLabel label6= new JLabel();
		
				ImageIcon image6=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/bnb.png");
				Border border6= BorderFactory.createLineBorder(Color.green, 3);
				label6.setText("BITCOIN");
				label6.setIcon(image6);
				label6.setIconTextGap(-10);
				label6.setForeground(Color.YELLOW);
				label6.setFont(new Font("MV Boli",Font.PLAIN,25));
				label6.setVerticalTextPosition(JLabel.BOTTOM);
				label6.setHorizontalTextPosition(JLabel.CENTER);
				
				JPanel panel6= new JPanel();
				panel6.setBackground(Color.white);
				panel6.add(label6);
				

				
				//
				JLabel label7= new JLabel();
				ImageIcon image7=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/avalanche.png");
				Border border7= BorderFactory.createLineBorder(Color.green, 3);
				label7.setText("AVALANCHE:65,87$");
				label7.setIcon(image7);
				label7.setIconTextGap(-10);
				label7.setForeground(Color.YELLOW);
				label7.setFont(new Font("MV Boli",Font.PLAIN,25));
				label7.setVerticalAlignment(JLabel.CENTER);
				label7.setVerticalTextPosition(JLabel.BOTTOM);
				label7.setHorizontalTextPosition(JLabel.CENTER);
				
				
				JPanel panel7= new JPanel();
				panel7.setBackground(Color.black);
				panel7.add(label7);
				
				JPanel panel8=new JPanel();
				panel8.setBackground(Color.black);
				panel8.setLayout(new BorderLayout(3,3));
				
				

				panel8.add(panel6,BorderLayout.NORTH);
				panel8.add(panel7,BorderLayout.SOUTH);
				panel8.add(panel4,BorderLayout.CENTER);
				
				
				
				panel.setPreferredSize(new Dimension(100, 100));
				panel2.setPreferredSize(new Dimension(100, 100));

				panel3.setPreferredSize(new Dimension(100, 100));

				panel4.setPreferredSize(new Dimension(20, 20));

				panel5.setPreferredSize(new Dimension(100, 100));
				panel6.setPreferredSize(new Dimension(50, 50));
				panel7.setPreferredSize(new Dimension(50, 50));

				panel8.setPreferredSize(new Dimension(150,150));


				
				
				
				
				
				
				JFrame frame=new JFrame();
				frame.setSize(888, 888);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("Crypto Ýcons");
				frame.setIconImage(image.getImage());
				frame.setLayout(new BorderLayout(1,1));
				frame.setVisible(true);
				frame.add(panel,BorderLayout.NORTH);
				frame.add(panel2,BorderLayout.WEST);
				
				frame.add(panel3,BorderLayout.EAST);
				frame.add(panel8,BorderLayout.PAGE_END);
				frame.add(panel5,BorderLayout.SOUTH);
				
		 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 * -------------------------------------------
 * 
 *
 * 		JLabel label= new JLabel();
		ImageIcon image=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/btc.png");
		Border border= BorderFactory.createLineBorder(Color.red, 3);
		label.setText("BITCOIN");
		label.setIcon(image);
		label.setIconTextGap(10);
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("MV Boli",Font.PLAIN,25));
		label.setVerticalAlignment(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setBorder(border);
		JPanel panel= new JPanel();
		panel.setBackground(new Color(0x000000));
		panel.setBounds(0, 0, 225, 275);
		panel.setLayout(new BorderLayout());
		panel.add(label);
		
		
		/// second one ETherium
		
		JLabel label2= new JLabel();
		ImageIcon image2=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/Eth.png");
		Border border2= BorderFactory.createLineBorder(Color.BLACK,1);
		label2.setText("Etherium");
		label2.setIcon(image2);
		label2.setIconTextGap(1);
		label2.setForeground(Color.BLACK);
		label2.setFont(new Font("MV Boli",Font.PLAIN,25));
		label2.setVerticalAlignment(JLabel.CENTER);
		label2.setVerticalTextPosition(JLabel.BOTTOM);
		label2.setHorizontalTextPosition(JLabel.CENTER);
		label2.setBorder(border2);
		JPanel panel2= new JPanel();
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(0, 275, 200, 275);
		panel2.setLayout(new BorderLayout());
		panel2.add(label2);
		
		/// third one USTD
		
		JLabel label3= new JLabel();
		ImageIcon image3=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/luna.jpg");
		Border border3= BorderFactory.createLineBorder(Color.green, 3);
		label3.setText("BITCOIN");
		label3.setIcon(image3);
		label3.setIconTextGap(10);
		label3.setForeground(Color.YELLOW);
		label3.setFont(new Font("MV Boli",Font.PLAIN,25));
		label3.setVerticalAlignment(JLabel.CENTER);
		label3.setVerticalTextPosition(JLabel.BOTTOM);
		label3.setHorizontalTextPosition(JLabel.CENTER);
		label3.setBorder(border3);
		JPanel panel3= new JPanel();
		panel3.setBackground(new Color(0x000000));
		panel3.setBounds(225, 200,450,450);
		panel3.setLayout(new BorderLayout());
		panel3.add(label3);
		/// xrp
		JLabel label4= new JLabel();
		ImageIcon image4=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/xrp.jpg");
		Border border4= BorderFactory.createLineBorder(Color.green, 3);
		label4.setText("BITCOIN");
		label4.setIcon(image4);
		label4.setIconTextGap(10);
		label4.setForeground(Color.YELLOW);
		label4.setFont(new Font("MV Boli",Font.PLAIN,25));
		label4.setVerticalAlignment(JLabel.CENTER);
		label4.setVerticalTextPosition(JLabel.BOTTOM);
		label4.setHorizontalTextPosition(JLabel.CENTER);
		label4.setBorder(border4);
		JPanel panel4= new JPanel();
		panel4.setBackground(new Color(0x000000));
		panel4.setBounds(225, 0,220,250);
		panel4.setLayout(new BorderLayout());
		panel4.add(label4);
		///doge 
		JLabel label5= new JLabel();
		ImageIcon image5=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/doge.jpg");
		Border border5= BorderFactory.createLineBorder(Color.green, 3);
		label5.setText("DOGE");
		label5.setIcon(image5);
		label5.setIconTextGap(10);
		label5.setForeground(Color.YELLOW);
		label5.setFont(new Font("MV Boli",Font.PLAIN,25));
		label5.setVerticalAlignment(JLabel.CENTER);
		label5.setVerticalTextPosition(JLabel.BOTTOM);
		label5.setHorizontalTextPosition(JLabel.CENTER);
		label5.setBorder(border4);
		JPanel panel5= new JPanel();
		panel5.setBackground(new Color(0x000000));
		panel5.setBounds(450, 0,220,250);
		panel5.setLayout(new BorderLayout());
		panel5.add(label5);
		///bnb
		
		JLabel label6= new JLabel();
		ImageIcon image6=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/bnb.png");
		Border border6= BorderFactory.createLineBorder(Color.green, 3);
		label6.setText("BITCOIN");
		label6.setIcon(image6);
		label6.setIconTextGap(10);
		label6.setForeground(Color.YELLOW);
		label6.setFont(new Font("MV Boli",Font.PLAIN,25));
		label6.setVerticalAlignment(JLabel.CENTER);
		label6.setVerticalTextPosition(JLabel.BOTTOM);
		label6.setHorizontalTextPosition(JLabel.CENTER);
		label6.setBorder(border6);
		JPanel panel6= new JPanel();
		panel6.setBackground(new Color(0x000000));
		panel6.setBounds(650, 20,220,180);
		panel6.setLayout(new BorderLayout());
		panel6.add(label6);
		//
		JLabel label7= new JLabel();
		ImageIcon image7=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/avalanche.png");
		Border border7= BorderFactory.createLineBorder(Color.green, 3);
		label7.setText("BITCOIN");
		label7.setIcon(image7);
		label7.setIconTextGap(10);
		label7.setForeground(Color.YELLOW);
		label7.setFont(new Font("MV Boli",Font.PLAIN,25));
		label7.setVerticalAlignment(JLabel.CENTER);
		label7.setVerticalTextPosition(JLabel.BOTTOM);
		label7.setHorizontalTextPosition(JLabel.CENTER);
		label7.setBorder(border7);
		JPanel panel7= new JPanel();
		panel7.setBackground(new Color(0x000000));
		panel7.setBounds(650, 275,240,200);
		panel7.setLayout(new BorderLayout());
		panel7.add(label7);
		
		
		
		
		
		
		
		
		
		JFrame frame=new JFrame();
		frame.setSize(900, 1400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Crypto Ýcons");
		frame.setIconImage(image.getImage());
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(panel);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(panel5);
		frame.add(panel6);
		frame.add(panel7);
 * 
 * 
 * 
 * 
 * ---------------------------------------------------
 *
 * ImageIcon image= new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/richard.jpg");
		MYJFrame frame= new MYJFrame();
		JLabel label= new JLabel();
		Border border= BorderFactory.createLineBorder(Color.red,3);
		
		label.setText("Richard Feynman");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setForeground(new Color(0x987653));
		label.setFont(new Font("MV Boli",Font.PLAIN,90));
		//label.setOpaque(true);
		label.setIconTextGap(25);
		label.setIcon(image);
		label.setBorder(border);
		label.setBounds(300, 150, 450,450);
		
		
		JLabel label2= new JLabel();
		Border border2= BorderFactory.createLineBorder(Color.BLUE,3);
		
		label2.setText("Richard Feynman");
		label2.setHorizontalTextPosition(JLabel.CENTER);
		label2.setVerticalTextPosition(JLabel.BOTTOM);
		label2.setForeground(new Color(0x987653));
		label2.setFont(new Font("MV Boli",Font.PLAIN,90));
		//label.setOpaque(true);
		label2.setIconTextGap(25);
		label2.setIcon(image);
		label2.setBorder(border2);
		label2.setBounds(400, 300, 300,350);
		
		for(int i=3;i<20;i++) {
			JLabel label3= new JLabel();
			
			label3.setText("Richard Feynman");
			label3.setHorizontalTextPosition(JLabel.CENTER);
			label3.setVerticalTextPosition(JLabel.BOTTOM);
			label3.setForeground(new Color(0x987653));
			label3.setFont(new Font("MV Boli",Font.PLAIN,90));
			//label.setOpaque(true);
			label3.setIconTextGap(25);
			label3.setIcon(image);
			label3.setBorder(border);
			label3.setBounds(200-(i*15), 350-(i*20), 400-(i*35),400-(i*35));
			frame.add(label3);
			
			
		}
		for(int i=3;i<20;i++) {
			JLabel label4= new JLabel();
			
			label4.setText("Richard Feynman");
			label4.setHorizontalTextPosition(JLabel.CENTER);
			label4.setVerticalTextPosition(JLabel.BOTTOM);
			label4.setForeground(new Color(0x987653));
			label4.setFont(new Font("MV Boli",Font.PLAIN,90));
			//label.setOpaque(true);
			label4.setIconTextGap(25);
			label4.setIcon(image);
			label4.setBorder(border2);
			label4.setBounds(300+(i*25), 350-(i*20), 400-(i*25),400-(i*25));
			frame.add(label4);
			
			
		}
		
		
		frame.add(label);
		frame.setTitle("Richard Feynman");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0x567765));
		frame.setSize(840,680);
		frame.setVisible(true);
		frame.setIconImage(image.getImage());
		frame.setLayout(null);
		
		frame.add(label2);
		
		//frame.pack();
		
 * 
 * 
 * 
 * 
 * 

 *
 *!!!!!!!!!!!!!!!       sysout
 *
 * 
 * JFrame frame= new JFrame();
		frame.setTitle("Richard Feynman");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(690,490);
		frame.getContentPane().setBackground(new Color(0x132546));
		frame.setVisible(true);
		
		ImageIcon image= new ImageIcon("/C:/Users/Enc/Desktop/richard.jpg");
		frame.setIconImage(image.getImage());
 * 
 * 
 * 
 * 	Car car1= new Car("lamborghini");
		Car car2= new Car("Ferairi");
		
		Garrage garrage= new Garrage();
		
		garrage.park(car1);
		garrage.park(car2);
	
 * 
 * ----------------------------------------------------------------
 * 
 * ArrayList<ArrayList<String>> alllist= new ArrayList();
		ArrayList<String> grocery= new ArrayList();
		grocery.add("fruit");
		grocery.add("juice");
		grocery.add("banana");
		
		ArrayList<String> other= new ArrayList();
		other.add("choclate");
		other.add("milk");
		other.add("cola");
		other.add("strawberries");
		
		
		// add all list to all list
		alllist.add(other);
		alllist.add(grocery);
		System.out.println(alllist);
		;
		System.out.println(alllist);
 * 
 * ----------------------------------------------------------------------------
 * Scanner scanner= new Scanner(System.in);
		System.out.print("what is your name : " );
		String name=scanner.nextLine();
		
		// TODO Auto-generated method stub
		System.out.println(" AGE: ");
		int ageofreis= scanner.nextInt();
		scanner.nextLine();
		System.out .println(" Statu: ");
		String statu=scanner.nextLine();
		System.out.println("biggility: ");
		int biggilty=scanner.nextInt();
		System.out.print("King:" +name+"\n Age of King: "+ ageofreis+"\n Statu of King: "+statu+"\n Biggest: "+biggilty);
		-----------------------------------------------------------------------------------------
		String name= JOptionPane.showInputDialog("Enter here name: ");
		JOptionPane.showMessageDialog(null,"KRALIMIZ!"+ name);		

		int age= Integer.parseInt(JOptionPane.showInputDialog("ENTER HERE AGE OUR KÝNG!: ")) ;
		JOptionPane.showMessageDialog(null,"age of out King! :"+ age);
		double height= Double.parseDouble(JOptionPane.showInputDialog("Enter HERE HEÝGHT"));
		System.out.println("Name : "+ name+"\n Age: "+age+"\n Height: "+height);
		----------------------------------------------------------------------------------------------
		Double x=  Double.parseDouble(JOptionPane.showInputDialog("X: "));
		Double y= Double.parseDouble(JOptionPane.showInputDialog("Y: "));	
		Double z= Math.sqrt((x*x)+(y*y));
		JOptionPane.showMessageDialog(null,"Hyptones: "+z);
		--------------------------------------------------------------------------------------------------
		int row;
		int columns;
		String sembol;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("ENTER HERE ROW: ");
		row=scanner.nextInt();
		
		System.out.println("ENTER HERE COLUMNS: ");
		columns=scanner.nextInt();
		System.out.println("ENTER HERE SEMBOL: ");
		sembol= scanner.next();
		for (int i=1;i<=row;i++) {
			System.out.println();
			for (int j=1;j<=columns;j++) {
				System.out.print(sembol);
			}
		}
		--------------------------------------------------------------------------------------------------------
		Scanner scanner= new Scanner(System.in);
		System.out.println("ENTER HERE ROW: ");
		
		int row= scanner.nextInt();
		System.out.println("ENTER HERE COLUMN: ");
		int column= scanner.nextInt();
		System.out.println("ENTER HERE YOUR STORY");
		
		
		
		String[][] array= new String[row][column];
		
		for (int i=0;i<=row-1;i++) {
			System.out.println();
			for (int j=0;j<=column-1;j++) {
				String story=scanner.next();

				array[i][j]=story;
				
				
			}
		}
		for(int i=0;i<=row-1;i++) {
			System.out.println();
			for(int j=0;j<=column-1;j++) {
				System.out.print(array[i][j]+"*");
				
			}
			
		}
-------------------------------------------------------------------------------------------
String string="I am string";
		char mychar ='Q';
		int intmy=21;
		double mydouble=21.21;
		System.out.printf("it '%3s ' ",string);
		System.out.printf("it' %c ' ",mychar);
		System.out.printf("it \"%d \"  ",intmy);
		System.out.printf("it \"%,2f ",mydouble);
		
		--------------------------------------------------------------
		Human human1= new Human("selhattin",19,75.5);
		Human human2= new Human("Mehmhet",20,70.2);
		Human human3= new Human("Yusuf",21,67.4);
		Human human4= new Human("Sedat",20,72);
		System.out.println(human2.age+human3.age+human4.age+human1.age);
		
		human1.read();
		
		human2.drink();
		human3.walk();
		human4.eat();
------------------------------------------------------------
Food[] foodarray= new Food[3];
		Food food1= new Food("Pizza");
		Food food2= new Food("Menemen");
		Food food3= new Food("Ciðer");
		foodarray[0]=food1;
		foodarray[1]=food2;
		foodarray[2]=food3;
		System.out.println(foodarray[1].name);
		
		
		
	*/	
