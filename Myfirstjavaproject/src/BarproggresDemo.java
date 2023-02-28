import java.awt.Color;
import java.awt.GridLayout;
import java.sql.Time;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class BarproggresDemo {
	JFrame frame;
	JProgressBar barprogress;
	
	
	BarproggresDemo(){
		barprogress=new JProgressBar();
		barprogress.setValue(0);
		barprogress.setString("Game is loading...");
		barprogress.setStringPainted(true);
		barprogress.setBounds(0, 0, 420, 40);
		barprogress.setBackground(new Color(0xF921988));
		barprogress.setForeground(new Color(0xFAA221));
		
		frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0x876231));
		frame.setLayout(new GridLayout(3,3,3,3));
		frame.setSize(250, 250);
		
		frame.add(barprogress);
		rogi();
		
		
		
	}
	void rogi() {
		int a=0;
		
	while(a<101) {
		
		barprogress.setValue(a);
		a++;
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}	
	barprogress.setString("Done :) Rogi");
	
	
	
	}

}
