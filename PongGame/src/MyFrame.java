import java.awt.Dimension;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame()  {
		this.add(new MyPanel());
		this.setSize(new Dimension(900,500));
		this.setResizable(false);
		this.setTitle("Pong Game");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
