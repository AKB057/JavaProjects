package BroCodeProjects;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JButtonDemo {
	
	public static void main(String[] args) {

		new Frame();
	}
	
}

class Frame extends JFrame implements ActionListener {
	
	// JButton GUI based button that performs action when clicked on
	
	JButton button;
	JLabel label;
	
	Frame()
	{
		label= new JLabel();
		button= new JButton();
		
		ImageIcon icon= new ImageIcon("label.png");
		
		label.setIcon(icon);
		label.setVisible(false);
		label.setBounds(100, 100, 200, 200);
		
		button.setBounds(100, 100, 100, 50); // setting the button dimensions.
		
		button.addActionListener(this); // to make the required action commit in the button
		
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		
		button.setBorder(BorderFactory.createEtchedBorder());
		
		button.setText("A button");
		button.setFocusable(false);
		
		button.setEnabled(true); // this is used to make a button disable once the action of click is completed.
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
		this.setLayout(null);
		
		this.add(button);
		this.add(label);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) { // we need to implement the ActionListner interface to make the button respond when clicked.
		
		if(e.getSource()==button)
		{
			button.setVisible(false);
			label.setVisible(true); 
		}
		
	}
		
}