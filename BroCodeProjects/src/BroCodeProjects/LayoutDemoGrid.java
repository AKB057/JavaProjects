package BroCodeProjects;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutDemoGrid {
	
	//GridLayout places components in a grid of cells. Each component takes all the available space within its cell, and each cell is same size
	
	public static void main(String[] args) {
		
		JFrame frame= new JFrame();
		frame.setTitle("Border Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new GridLayout(5,2,10,10)); //we can give the number of the rows by column inside the Grid Layout, also we can adjust spacing between the cells vertical and then horizontally. 
		
		frame.setVisible(true);
		frame.setSize(200,200);
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		frame.add(new JButton("0"));
		
		frame.setLocationRelativeTo(null);
	}

}
