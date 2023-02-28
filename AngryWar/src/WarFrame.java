import java.awt.Color;

import javax.swing.JFrame;

public class WarFrame extends JFrame{
	WarFrame(){
		this.setSize(800,800);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setBackground(Color.black);
		this.add(new WarPanel());
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		
		
	}

}
