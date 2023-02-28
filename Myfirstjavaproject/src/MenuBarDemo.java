import javax.swing.JFrame;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Time;
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

public class MenuBarDemo extends JFrame implements ActionListener {
	JMenuBar menu;
	JMenu filemenu;
	JMenu editmenu;
	JMenu helpmenu;
	JMenuItem loaditem;
	JMenuItem saveitem;
	JMenuItem exititem;
	JMenuItem renameitem;
	JMenuItem redrawitem;
	JMenuItem yeshelpitem;
	TextField textfield;
	JButton button;
	ArrayList listofsave;
	
	MenuBarDemo(){
		menu=new JMenuBar();
		menu.setBounds(0, 0, 100, 20);
		
		filemenu= new JMenu("File");
		
		
		editmenu= new JMenu("Edit");
		
		helpmenu=new JMenu("Help :)");
		
		loaditem=new JMenuItem("LoadItem");
		
		saveitem= new JMenuItem("SaveItem");
		
	    exititem= new JMenuItem("ExitItem");
	    
		renameitem=new JMenuItem("RenameItem");
		
		redrawitem=new JMenuItem("RedrawItem");
		
		yeshelpitem=new JMenuItem("Yes Help ITEM!!!");
		
		
		loaditem.addActionListener(this);
		saveitem.addActionListener(this);
		exititem.addActionListener(this);
		renameitem.addActionListener(this);
		redrawitem.addActionListener(this);
		yeshelpitem.addActionListener(this);
		
		
		menu.add(filemenu);
		menu.add(editmenu);
		menu.add(helpmenu);
		
		filemenu.add(loaditem);
		filemenu.add(saveitem);
		filemenu.add(exititem);
		
		editmenu.add(renameitem);
		editmenu.add(redrawitem);
		
		helpmenu.add(yeshelpitem);
		
		this.setSize(840, 840);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.getContentPane().setBackground(new Color(0x2ADFD));
		this.setJMenuBar(menu);
		this.setVisible(true);
		
		
		textfield=new TextField("laaaaaaaaaaan ayýptýr olummmmmmmmmmmmmmmmmm"
				+ ""
				+ ""
				+ "asdþasþd"
				+ "adisþaisd"
				+ "iasþdaþs"
				+ "tabiiiiiiiii "
				+ "caným"
				+ "hade");
		textfield.setBackground(new Color(0xFAFFAD));
		textfield.setBounds(40, 40,2400, 2500);
		textfield.setForeground(new Color(0xAFAF34));
		this.add(textfield);
		
//		BUTTON
		
		button=new JButton();
		button.setBounds(300, 300, 220, 160);
		button.setBackground(new Color(0xAFF236));
		
		
		button.setText("Save it Rogi rogi rogi rogi rogi rogi rogi rogi rogi rogi rogi rogi");
		button.addActionListener(this);
		this.add(button);
		
		listofsave= new ArrayList();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		
		if(e.getSource()==loaditem) {
			textfield.setText("item is loading...");
			try {
				Thread.sleep(500);
				for(int i=0;i<listofsave.size();i++) {
					
					textfield.setText(listofsave.get(i).toString());
					
				}
				
				
				
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		else if(e.getSource()==saveitem) {
			textfield.setText("item is saving...");
			try {
				Thread.sleep(500);
				for(int i=0;i<listofsave.size();i++) {
					
					textfield.setText(listofsave.get(i).toString());
					
				}
				
				
				
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
		}
		else if(e.getSource()==exititem)  {
			textfield.setText("Good Bye :))))):::::)))))))");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			System.exit(0);
			
		
			
			
			
		}
		
		else if (e.getSource()==renameitem){
			textfield.setText("Name is changing ...");
			
			
			
			
		}
		else if(e.getSource()==redrawitem) {
			textfield.setText("Graph is redrawn...");
			
			
			
		}
		else if (e.getSource()==yeshelpitem) {
			
			textfield.setText("PUAHAHAHAHHA  DÝD I HEAR RÝGHT?____???????_____??");
		}
		
		else if (e.getSource()==button) 
		
		{
			
			listofsave.add(textfield.toString().codePointAt(4));
			
			JFileChooser file= new JFileChooser();
			file.setCurrentDirectory(new File ("C:\\Users\\Enc\\Desktop"));
			
			
			
		}
		
	}
	


		
	}


