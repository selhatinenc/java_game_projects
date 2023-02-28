import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnakeFrame extends JFrame {
	SnakeFrame(){
		this.setSize(1350,850);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setBackground(Color.black);
		this.add(new SnakePanel());
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		
		
	}
}
