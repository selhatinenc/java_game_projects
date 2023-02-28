import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider implements ChangeListener  {
	JLabel label;
	JSlider slider;
	JFrame frame;
	int a;
	Slider(){
		
		
		
		label=new JLabel();
		slider=new JSlider(0,100,40);
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.addChangeListener(this);
		
		slider.setPaintLabels(true);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		label.setText("        C:"+slider.getValue());
		label.setFont(new Font("MV Boli",Font.BOLD,21));
		
		
		frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0xFAC231));
		frame.setLayout(new GridLayout(3,3,3,3));
		frame.setSize(250, 250);
		frame.add(slider);
		frame.add(label);
		
		
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		a++;
		label.setText("    C: "+slider.getValue());
	}
}
