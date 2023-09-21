package BroCodeProjects;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutDemoBorder {
	// Layout manager defines the natural layout of the component in a container
	
	//Border Layout is a type in which we can place the components within the border areas(North,East,West,South,Center). This will be auto fixed	
	
	public static void main(String[] args) {
	
		JFrame frame= new JFrame();
		
		frame.setTitle("Border Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout(10,10));
		frame.setVisible(true);
		
		JPanel panel1= new JPanel();
		JPanel panel2= new JPanel();
		JPanel panel3= new JPanel();
		JPanel panel4= new JPanel();
		JPanel panel5= new JPanel();
		
		panel1.setBackground(Color.orange);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.white);
		panel4.setBackground(Color.cyan);
		panel5.setBackground(Color.pink);
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		JPanel subpanel1= new JPanel();
		JPanel subpanel2= new JPanel();
		JPanel subpanel3= new JPanel();
		JPanel subpanel4= new JPanel();
		JPanel subpanel5= new JPanel();
		
		subpanel1.setBackground(Color.blue);
		subpanel2.setBackground(Color.lightGray);
		subpanel3.setBackground(Color.black);
		subpanel4.setBackground(Color.gray);
		subpanel5.setBackground(Color.red);
		
		subpanel1.setPreferredSize(new Dimension(50,50));
		subpanel2.setPreferredSize(new Dimension(50,50));
		subpanel3.setPreferredSize(new Dimension(50,50));
		subpanel4.setPreferredSize(new Dimension(50,50));
		subpanel5.setPreferredSize(new Dimension(50,50));
		
		panel3.setLayout(new BorderLayout()); // the center panel holds the subpanels that is created, we have to use the Border Layout for the panel to hold it within the borders
		
		panel3.add(subpanel1,BorderLayout.EAST);
		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.SOUTH);
		frame.add(panel3,BorderLayout.CENTER);
		frame.add(panel4,BorderLayout.EAST);
		frame.add(panel5,BorderLayout.WEST);
	}
}

