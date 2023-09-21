package BroCodeProjects;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLabelDemo {
	
	public static void main(String[] args) {
		
		//JLabel = a GUI display area for a string of text, an image or both.
		
		ImageIcon image= new ImageIcon("Label.png"); // ImageIcon is an inbuilt class to taken in an image and then pass it accordingly to use in a program
		
		JLabel label= new JLabel();		// create a label using the JLabel class available.
										
		Border border= BorderFactory.createLineBorder(Color.black,10); // creating a border for the label inside the frame using Border class
		
											//setting the label with input accordingly.
		label.setText("Java Programmer");
		label.setIcon(image);
											// used to move the text to different positions
		label.setHorizontalTextPosition(JLabel.CENTER); 		// according to imageIcon horizontally.
		label.setVerticalTextPosition(JLabel.TOP); 				// according to imageIcon vertically.
		
											//used to move the position within the label(icon+text)
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		//label.setBounds(70, 60, 100, 100); // this is used to set the label within a position inside the frame using setLayout
		
		label.setBackground(Color.blue);
		label.setOpaque(true);
		label.setBorder(border);
		
		label.setIconTextGap(23); 
		
		JFrame frame= new JFrame();
		
		frame.setVisible(true);
		//frame.setSize(250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		//frame.setLayout(null);
		frame.pack();		//this is a function that sets the label and frame within size that is the same as the label.
	}

}
