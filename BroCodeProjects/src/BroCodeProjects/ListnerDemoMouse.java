package BroCodeProjects;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ListnerDemoMouse {
	
	public static void main(String[] args) {
		
		new MouseFrame();
		
	}
}

class MouseFrame extends JFrame implements MouseListener{

	
	JLabel label;
	
	ImageIcon smile;
	ImageIcon dizzy;
	ImageIcon nervous;
	ImageIcon pain;
	
	
	public MouseFrame() {
		
		label= new JLabel();
		
		smile= new ImageIcon("Happyemo.png");
		dizzy= new ImageIcon("dizzyemo.png");
		nervous= new ImageIcon("nervousemo.png");
		pain= new ImageIcon("painemo.png");
		
		label.setIcon(smile);
		label.addMouseListener(this);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

		this.setLayout(new FlowLayout());
		
		
		this.add(label); // first add the component to the Frame and then use the below pack method
		this.pack(); 	 
		this.setLocationRelativeTo(null); // this is a method to automatically make the frame appear in the middle has to be used in order after packing
		
	}

	@Override
	public void mouseClicked(MouseEvent e) { // invoked when the mouse button is clicked(pressed and released) on a component
		//System.out.println("You have clicked the mouse"); // we have to click and release for this to work
		
	}

	@Override
	public void mousePressed(MouseEvent e) { // invoked when a mouse button has been pressed on a component
		//System.out.println("You have pressed the mouse");
		label.setIcon(pain);
	}

	@Override
	public void mouseReleased(MouseEvent e) { // invoked when a mouse button has been released on a component
		//System.out.println("You have released the mouse");
		label.setIcon(nervous);
	}

	@Override
	public void mouseEntered(MouseEvent e) { // invoked when a mouse enters the area of the component
		//System.out.println("Your mouse is within the zone");
		label.setIcon(dizzy);
	}

	@Override
	public void mouseExited(MouseEvent e) { // invoked when a mouse exits the area of the component
		//System.out.println("Your mouse has gone beyond the zone");
		label.setIcon(smile);
	}
	
	
}