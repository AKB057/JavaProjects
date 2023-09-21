package BroCodeProjects;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameProg {
	
	public static void main(String[] args) {
		
		//JFrame is a GUI window where we can add components to.
		JFrame frame= new JFrame();
		
		frame.setVisible(true);
		
		frame.setSize(430,420);// sets x and y dimension
		
		frame.setTitle("JFrame title");// set a title for the frame
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit on close
		
		frame.setResizable(false); //stop resizing the Jframe as a window	
		
		ImageIcon logo= new ImageIcon("logo.png"); // create an image icon
		
		frame.setIconImage(logo.getImage());
		
		frame.getContentPane().setBackground(new Color(123,234,213));// frame.getContentPane().setBackground(Color.BLACK);
		
	}

}

// we can also create a JFrame by creating a class and extending JFrame class 