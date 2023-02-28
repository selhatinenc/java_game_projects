import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sone extends JFrame implements KeyListener {
	
	JLabel label;
	ImageIcon icon;
	
	Sone(){		
		Random random=new Random();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(2220,2000);
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/btc.png");
		
		label = new JLabel();
		label.setBounds(0, 0, 122, 120);
		label.setIcon(icon);
		//label.setBackground(Color.red);
		label.setOpaque(true);
		this.getContentPane().setBackground(Color.white);
		this.add(label);
		this.setBackground(new Color(0xA84733));
		
		this.setVisible(true);
		
		ImageIcon icon2= new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/shark.jpg");
		
		
		JLabel label2=new JLabel();
		label2.setBounds(490, 360, 118, 122);
		label2.setIcon(icon2);
		
		this.add(label2);
		
		
		ImageIcon icon3=new ImageIcon("C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/dog.jpg");
		ImageIcon icon4=new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/hugola.jpg");	
		ImageIcon iconrich= new ImageIcon("/C:/Users/Enc/eclipse-workspace/Myfirstjavaproject/src/richard.jpg");
		
		
		JLabel label3=new JLabel();
		label3.setBounds(260, random.nextInt(0,600), 120,122);
		label3.setIcon(icon3);
		
		this.add(label3);
		
		
		JLabel label4=new JLabel();
		label4.setBounds(660, random.nextInt(0,600), 120, 122);
		label4.setIcon(icon4);
		
		this.add(label4);
		
		
		JLabel label5=new JLabel();
		label5.setBounds(890, random.nextInt(0,600), 120, 122);
		label5.setIcon(iconrich);	
		
		this.add(label5);
		
		JLabel label6=new JLabel("finish");
		label6.setFont(new Font("MV Boli",Font.BOLD,40)	);
		
		label6.setBounds(890, 500, 120, 122);
		label6.setBackground(new Color(0x351876));
		this.add(label6);
		
		
		
		
		while (true) {
			
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int randomnumber = random.nextInt(-50,50);
			int randomnumber2 = random.nextInt(-50,50);
			int randomnumber3 = random.nextInt(0,140);
			int randomnumber4 = random.nextInt(0,160);
			int randomnumber5 = random.nextInt(0,120);
			
					
			label2.setBounds(random.nextInt(100,800)+randomnumber,randomnumber3+randomnumber4+randomnumber5, 120+(randomnumber2/10),122+ (randomnumber/10));
			label3.setBounds(random.nextInt(100,800)+randomnumber, random.nextInt(0,600), 120, 122);
			label4.setBounds(random.nextInt(100,800)+randomnumber, random.nextInt(0,600), 120, 122);
			label5.setBounds( random.nextInt(100,800)+randomnumber, random.nextInt(0,600), 120, 122);
			
			
			
			
		}
		
	}

	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		//keyTyped = Invoked when a key is typed. Uses KeyChar, char output
		switch(e.getKeyChar()) {
			case 'a': label.setLocation(label.getX()-10*4, label.getY());
				break;
			case 'w': label.setLocation(label.getX(), label.getY()-40);
				break;
			case 's': label.setLocation(label.getX(), label.getY()+40);
				break;
			case 'd': label.setLocation(label.getX()+40, label.getY());
				break;
		}
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}

