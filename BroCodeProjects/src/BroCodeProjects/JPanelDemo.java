package BroCodeProjects;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelDemo {
	
	//JPanel is a GUI component that functions as a container to hold other container.
	
	public static void main(String[] args) {
		
		ImageIcon image= new ImageIcon("thumpsup.png");
		
		JLabel label= new JLabel();			//a label is used in the JPanel class in order to add image icon or text inside a  panel.
		label.setIcon(image);
		label.setBounds(0, -20, 100, 100);
		
		
		JPanel blpanel= new JPanel();
		blpanel.setBackground(Color.BLACK);
		blpanel.setBounds(0, 0, 100, 100);
		blpanel.setLayout(null);

		JPanel redpanel= new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(100, 0, 100, 100);
		redpanel.setLayout(null);
		
		JPanel greenpanel= new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0, 100, 200, 100);
		greenpanel.setLayout(null);
		
		JFrame frame= new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(250,250);
		frame.setLayout(null);
		
		frame.add(blpanel);
		frame.add(redpanel);
		frame.add(greenpanel);
		

		
		blpanel.add(label);		// label can be used once and the last usage will be reflected in the Jpanel
	}

}
