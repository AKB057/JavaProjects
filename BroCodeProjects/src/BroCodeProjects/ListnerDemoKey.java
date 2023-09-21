package BroCodeProjects;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ListnerDemoKey {

	public static void main(String[] args)
	{
		
		new MyFrame(); 
	}

}

class MyFrame  extends JFrame implements KeyListener{
	
	JLabel label;
	
	
	MyFrame()
	{ 
		ImageIcon icon = new ImageIcon("Rocket.png");
		
		label= new JLabel();
		label.setBounds(0, 0, 100, 100);
	/*	label.setBackground(Color.BLUE);
		label.setOpaque(true);
	*/	label.setIcon(icon);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setLayout(null);
		this.setVisible(true);
		
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		
		this.addKeyListener(this);
	}
 
	@Override
	public void keyTyped(KeyEvent e) { 		// is invoked when a key is typed
		switch(e.getKeyChar())				// in order to get the key typed we use the method getkeyChar
		{
		case 'a': label.setLocation(label.getX()-10, label.getY());
		break; 
		
		case 's': label.setLocation(label.getX(), label.getY()+10);
		break;
	
		case 'd': label.setLocation(label.getX()+10, label.getY());
		break;
		
		case 'w': label.setLocation(label.getX(), label.getY()-10);
		break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) { 	// is invoked when a physical key is pressed down
		switch(e.getKeyCode())				// in order to get the key pressed we use the method getkeyCode
		
		{ 
		case 37: label.setLocation(label.getX()-10, label.getY());
		break;
		
		case 38: label.setLocation(label.getX(), label.getY()-10);
		break;
	
		case 39: label.setLocation(label.getX()+10, label.getY());
		break;
		
		case 40: label.setLocation(label.getX(), label.getY()+10);
		break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) { 	// called when a button is released.
		
		System.out.println("You released key charecter: "+e.getKeyChar());
		System.out.println("You released key code: "+e.getKeyCode());
	}
}