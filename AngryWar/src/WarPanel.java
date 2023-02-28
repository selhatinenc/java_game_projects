import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class WarPanel extends JPanel implements MouseListener
	
	
{
	
	
	int weight=800;
	int height=800;
	
	JLabel[] labels=new JLabel[64];
	
	WarPanel(){
		this.setBackground(Color.white);
		this.setLayout(new GridLayout(8,8));
		this.setPreferredSize(new Dimension(weight,height));
		this.setFocusable(true);
		this.setSize(new Dimension(weight,height));
		this.addKeyListener(new MykeyAdapter());
		
		for (int i = 0; i < 64; i++) {
			labels[i]=new JLabel();
			labels[i].setBackground(Color.blue);
			labels[i].setFocusable(false);
			labels[i].addMouseListener(null);
			
			this.add(labels[i]);
			
			

			
		}
		StartGame();
		 
		
		
		
	}

	private void StartGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
