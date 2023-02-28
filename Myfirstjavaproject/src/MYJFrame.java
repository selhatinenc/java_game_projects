import java.awt.Color;
import java.util.Random;

import javax.print.attribute.standard.DateTimeAtCreation;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MYJFrame extends JFrame {
	MYJFrame(){
		Random random=new Random();
		this.setTitle("Richard Feynman");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.getContentPane().setBackground(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));

		ImageIcon image= new ImageIcon("/C:/Users/Enc/Desktop/richard.jpg");
		this.setIconImage(image.getImage());
		new JLabel(image);
		
		this.setVisible(true);

	}
}