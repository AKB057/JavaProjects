package BroCodeProjects;


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayeredPaneDemo {
	
	public JLayeredPaneDemo() {
JFrame frame= new JFrame();
		
		JLayeredPane pane= new JLayeredPane();
		
		pane.setBounds(0, 0, 500, 500);
		
		JLabel label1= new JLabel();
		label1.setBounds(50, 50, 200, 200);
		label1.setBackground(Color.orange);
		label1.setOpaque(true);
		
		JLabel label2= new JLabel();
		label2.setBounds(100, 100, 200, 200);
		label2.setBackground(Color.white);
		label2.setOpaque(true);
		
		JLabel label3= new JLabel();
		label3.setBounds(150, 150, 200, 200);
		label3.setBackground(Color.green);
		label3.setOpaque(true);
		
		
							// we are placing the components inside the pane and then it will be in 3D position
		pane.add(label1,JLayeredPane.DEFAULT_LAYER);   // we can stack each layer on top of each other depending on which layer we need to it to be stacked.
		pane.add(label2,Integer.valueOf(4));	// we have the top layer as Drag and the bottom layer as Drag Layer or the highest integer value
		pane.add(label3,Integer.valueOf(3));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(500,500);
		
		frame.add(pane);
	}
	
	public static void main(String[] args) {
		
		//JLayered Pane is swing container that provides 3D for positioning components.
		
		JLayeredPaneDemo demo= new JLayeredPaneDemo();
		
	}

}
