import java.awt.Component;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	static final int Screenwith=900;
	static final int ScreenHeigth=500;
	
	
	MyPanel(){
		this.setPreferredSize(new Dimension(Screenwith,ScreenHeigth));
		this.setBackground(Color.black);
		
	}

}
