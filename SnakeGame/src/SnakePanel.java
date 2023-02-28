import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.Border;

public class SnakePanel  extends JPanel implements ActionListener{
	 static final int height=700;
	 static final int weight=1200;
	 static final int unit=50;
	 static final int gameunit=(height*weight)/(unit*unit);
	 static final int delay=150;
	private static final KeyListener MykeyAdapter = null;
	 final int x[]=new int[gameunit];
	 final int y[]=new int[gameunit];
	 final int xc[]=new int[gameunit];
	 final int yc[]=new int[gameunit];
	 int xapple;
	 int yapple;
	 int bodyparts=6;
	 int time=0;
	 
	 int cbodyparts=6;
	 boolean running;
	 Timer timer;
	 Random random=new Random();
	 int appleseaten;
	 int cappleseaten;
	 char direction='r';
	 char cdirection='d';
	 int a =random.nextInt(255);
	 int b=random.nextInt(255);
	 int c=random.nextInt(255);
	 int d=random.nextInt(255);
	 int e=random.nextInt(255);
	 int f=random.nextInt(255);		
	SnakePanel(){
		this.setBackground(Color.red);
		this.setPreferredSize(new Dimension(weight,height));
		this.setFocusable(true);
		this.setSize(new Dimension(weight,height));
		this.addKeyListener(new MykeyAdapter());
		StartGame();
		
		
		
	}
	public void StartGame() {
		
		running=true;
		NewApple();
		timer=new Timer(delay,this);
		timer.start();
		
		
		 
		
	}

	public void NewApple() {
		xapple= random.nextInt((int)(weight-50)/unit)*unit;
		yapple= random.nextInt((int)(height-50)/unit)*unit;	
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
		
		
		
	}
	private void draw(Graphics g) {
		// TODO Auto-generated method stub
		if(running) {
			time++;
			for(int i=0;i<(weight/unit)+1	;i++) {
				
				g.setColor(Color.yellow);
				g.drawLine(i*unit, 0, i*unit,height);
				
				g.drawLine(0, i*unit, weight,i*unit );
				
				
				
				
				
				
			}
			
			g.setColor(Color.green);
			g.fillOval(xapple, yapple, unit,unit);
			
			for(int i=0;i<bodyparts;i++) {
				g.setColor(new Color(a,b,c));
				g.fillRect(x[i], y[i], unit, unit);
				if(i==0) {
					g.setColor(new Color(200,200,200));
					g.fillRect(x[i], y[i], unit, unit);
				}
				
				
			}
			for(int i=0;i<cbodyparts;i++) {
				g.setColor(new Color(d,e,f));	
				g.fillRect(xc[i], yc[i], unit, unit);
				if(i==0) {
					g.setColor(new Color(50,50,50));
					g.fillRect(xc[i], yc[i], unit, unit);
				}
				
			}
				
				
				
				
				
			
		}
		else{
			
			timer.stop();
			
		}
	
	
	
	
	}
	public void move() {
		
		
		for(int i=bodyparts;i>0;i--) {
			x[i]=x[i-1];
			y[i]=y[i-1];
			
			
		}
		switch(direction) {
		case 'u':
			y[0]=y[0]-unit;
		
		break;
		case 'd':
			y[0]=y [0]+unit;
		
		break;
		case 'r':
			x[0]=x [0]+unit;
			
		
		break;
		case 'l':
			x[0]=x [0]-unit;
		
		break;
		}
		for(int i=cbodyparts;i>0;i--) {
			xc[i]=xc[i-1];
			yc[i]=yc[i-1];
			
			
		}
		switch(cdirection) {
		case 'u':
			
			yc[0]=yc[0]-unit;
		
		break;
		case 'd':
			yc[0]=yc [0]+unit;
		
		break;
		case 'r':
			xc[0]=xc [0]+unit;
			
		
		break;
		case 'l':
			xc[0]=xc [0]-unit;
		
		break;
		}
		
		
		
	}
	
	public void checkapple() {
		
		if(x[0]==xapple && y[0]==yapple) {
			appleseaten++;
			bodyparts++;
			NewApple();
			
		}
		if(xc[0]==xapple && yc[0]==yapple) {
			cappleseaten++;
			cbodyparts++;
			NewApple();
			
		}
	}	
	public void checkcollision(){
	
		for(int i =bodyparts;i>0;i--) {
			
			if(x[0]==x[i] && y [0]==y[i]) {
				running=false;
				
			}
			
		}
		if(x[0]>weight-50) {
			running=false;
		}
		if(x[0]<0) {
			running=false;
		}
		if(y[0]>height-50) {
			running=false;
		}
		if(y[0]<0) {
			running=false;
		}
	
		if(!running) {
			timer.stop();
		}
		

		for(int i =cbodyparts;i>0;i--) {
			if(time>30) {
			for(int j=bodyparts;j>0;j--) {
				if(x[j]==xc[i]&&y[j]==yc[i]) {
					running=false;
				}
			}
			}
			
			if(xc[0]==xc[i] && yc [0]==yc[i]) {
				running=false;
				
				
			}
			
		}
		
		if(xc[0]>weight) {
			running=false;
		}
		if(xc[0]<0) {
			running=false;
		}
		if(yc[0]>height) {
			running=false;
		}
		if(yc[0]<0) {
			running=false;
		}
	
		if(!running) {
			timer.stop();
		}
		
		
	}
		
	public void gameover() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(running) {
			move();
			checkapple();
			checkcollision();
			
		}
		
		repaint();
		
	}
	public class MykeyAdapter extends KeyAdapter {
		
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_UP:
				if(direction!='d') {
					direction='u';
				}
				break;
			case KeyEvent.VK_DOWN:
				if(direction!='u') {
					direction='d';
				}
				break;
	
			case KeyEvent.VK_RIGHT:
				if(direction!='l') {
					direction='r';
				}
				break;
	
			case KeyEvent.VK_LEFT:
				if(direction!='r') {
					direction='l';
				}
				break;
			case KeyEvent.VK_S:
				if(cdirection!='u') {
					cdirection='d';
				}
				break;
			case KeyEvent.VK_W:
				if(cdirection!='d') {
					cdirection='u';
				}
				break;
				
			case KeyEvent.VK_D:
				if(cdirection!='l') {
					cdirection='r';
				}
				break;
			case KeyEvent.VK_A:
				if(cdirection!='r') {
					cdirection='l';
				}
				break;
			
			
				
			
			}
			
			
			
		}
		
	}
	
	
}
    















