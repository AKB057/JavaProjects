package BroCodeProjects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TwoDAnimationDemo {
	
	public static void main(String[] args) {
		
		new AnimFrame();
	}
}

class AnimFrame extends JFrame {
	
	AnimPanel panel;
	
	public AnimFrame() {
		
		panel= new AnimPanel();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		
	}
}

class AnimPanel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH =400;
	final int PANEL_HEIGHT=400;
	
	Image enemy;
	Image background;
		
	Timer timer;		// we are using Timer from Swing package for this.
	
	int xVelocity= 3;
	int yVelocity= 1;
	
	int x=0;
	int y=0;
	
	public AnimPanel() {
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		
		enemy= new ImageIcon("enemy.png").getImage();
		background= new ImageIcon("space.png").getImage();
		timer= new Timer(1, this);			// the timer is made to change within milliseconds
		timer.start();
		
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g); // calling this super will draw the background to black for us.
		 
		Graphics2D g2D= (Graphics2D)g;
		
		g2D.drawImage(background, 0, 0, null);
		g2D.drawImage(enemy, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
													   // image moves from left to right in positive and then change to right to left and vice versa 
						                               // we reduce the x from the end point of the image with the panel so that the enemy image do not move from the frame
		if(x>=PANEL_WIDTH-enemy.getWidth(null) || x<0) // this is to change the direction of the image once it gets to the extreme exits of panel
		{				
			xVelocity= xVelocity * -1; 				   // to change the direction we can change the sign of the velocity to move backwards
		}
			
		x=x+xVelocity;
		
		if(y>=PANEL_WIDTH- enemy.getWidth(null) || y<0)
		{
			yVelocity= yVelocity*-1;
		}
		y= y+yVelocity;
		
		repaint();		// we cannot invoke paint directly we need to use the repaint method in order to make the movement visible within the frame
	}
}
