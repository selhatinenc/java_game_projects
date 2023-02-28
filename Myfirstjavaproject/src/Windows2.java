import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Windows2 implements ActionListener {
	JButton button2;
	TextField textfield;
	JFrame frame;
	public String textsended;
	Windows2(){
		textfield= new TextField("Hello KÝNG SELO");
		button2=new JButton("CLÝCK ÝT");
		button2.addActionListener(this);
		

		frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0x246731));
		frame.setLayout(new GridLayout(3,3,3,3));
		frame.setSize(250, 250);
		frame.add(textfield);
		frame.add(button2);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button2) {
			textsended=textfield.getText();
			frame.dispose();
			new Windows1();
			
			
		}
	}

}
