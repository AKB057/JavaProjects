package BroCodeProjects;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutDemoFlow {
	
	// Layout manager defines the natural layout of the component in a container

	// FlowLayout places every component in a preferred size within a row, it will move the components to the next row of the horizontal space is limited in the first row
		 
	public static void main(String[] args) {
		
		JFrame frame= new JFrame(); 
		
		frame.setTitle("Border Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER)); //we can position this to different, leading - push it to left hand, Trailing - to right hand side
		frame.setVisible(true);
		
		JPanel panel= new JPanel();
		panel.setPreferredSize(new Dimension(180,170));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout()); // panel uses the flow layout by default
		
		// we can add the button directly the frame or we can use the panel to contain the components and then add the panel to the frame.
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		panel.add(new JButton("0"));
		
		frame.add(panel);
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		
	}
	
}
