import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
	JFrame frame;

	JLabel label;
	
	UpAction upAction;
	DownAction downAction;
	LeftAction leftAction;
	RightAction rightAction;
	
	
	
	Game(){
		
		frame=new JFrame("Key");
		frame.setVisible(true);

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(840,840);
		label=new JLabel();
		label.setBackground(Color.red);
		label.setBounds(10, 100, 50, 50);
		
	
		

		frame.add(label);

		
		upAction= new UpAction();
		downAction= new DownAction();
		leftAction=new LeftAction();
		rightAction= new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("w"), "upAction");
		label.getActionMap().put("upAction", upAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("s"), "downAction");
		label.getActionMap().put("downAction", downAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("a"), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("d"), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		
		

		

	}
		
	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(), label.getY()+21);
			
		}
		
		
	}
	
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(), label.getY()-21);

			
		}
		
		
	}
	
		
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX()-21, label.getY());

			
			
		}
		
		
	}
	
		
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX()+21, label.getY());

		}
		
		
	}
	
		
		
		

	}


		
		
