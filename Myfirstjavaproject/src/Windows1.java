import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Windows1 implements ActionListener{
	Button button5;
	JFrame frame;
	Windows1(){
		
		frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0xFAC231));
		frame.setLayout(new GridLayout(3,3,3,3));
		frame.setSize(250, 250);
		
		button5=new Button("LÝNCOLN");
		button5.addActionListener(this);
		
		frame.add(new Button("Buton1"));
		frame.add(new Button("Buton2"));
		frame.add(new Button("Buton3"));
		frame.add(new Button("Buton4"));
		frame.add(button5);
		frame.add(new Button("Buton6"));
		frame.add(new Button("Buton7"));
		frame.add(new Button("Buton8"));
		frame.add(new Button("Buton9"));

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button5) {
			frame.dispose();
			new Windows2();
			
		}
		
	}
	

}
