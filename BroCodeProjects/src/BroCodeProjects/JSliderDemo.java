package BroCodeProjects;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderDemo {
	
	//JSlider is a GUI component that lets user enter a value by using an adjustable sliding knob on a track
	 
	public static void main(String[] args) {
		new SliderFrame();
	}
}

class SliderFrame implements ChangeListener{

	JFrame frame;
	JPanel panel;
	JSlider slider;
	JLabel label; 
	
	
	public SliderFrame() {
		
		frame= new JFrame();
		panel= new JPanel();
		slider= new JSlider(0,100,50);
		label= new JLabel();
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		slider.setPreferredSize(new Dimension(200,200));
		
		// to make small ticks in the slider
		slider.setPaintTicks(true);				//this to make the scale ticks inside the slider to visible. 
		slider.setMinorTickSpacing(5);			//we can intervals between each ticks in the slider.
		
		// to make major ticks in the slider
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);			//this is to make the major intervals visible to denote the values in between
		slider.setPaintLabels(true);			//this is to display the numbers in the major ticks
		
		slider.setFont(new Font("MV Boli", Font.BOLD, 15)); 
		slider.setOrientation(SwingConstants.VERTICAL);		// by default the orientation is set to Horizontal for slider, here we can change it using SwingConstants
		slider.addChangeListener(this);
		
		label.setText("degree C ="+slider.getValue());
		label.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 20));
		
		panel.add(slider); //we add the slider to the panel and the label post we add the panel to the slider.
		panel.add(label);
		
		frame.add(panel);
		frame.setSize(300, 300);
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("degree C ="+slider.getValue());
	}
	
}
