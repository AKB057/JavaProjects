package BroCodeProjects;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PainterDemo {
	public static void main(String[] args) {
		
		new PaintFrame();
	}
}

class PaintFrame extends JFrame{
	
	MyPanel panel;
	public PaintFrame() {
		
		panel= new MyPanel();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null); 
		this.setVisible(true);
	}
	
}

class MyPanel extends JPanel{ // using a paint component inside a panel and then adding that panel to the frame works better
	
	public MyPanel() {
		this.setPreferredSize(new Dimension(400,400));
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2D= (Graphics2D) g;
											// We require to set the required parameters for drawing a particular object. Post then it will reflected in the object
		g2D.setStroke(new BasicStroke(10)); // The Basic Stroke class is to make the line thicker.
		g2D.setPaint(Color.blue);
		
		g2D.drawLine(0, 0, 400, 400); 		// if we use this directly on the frame we will see some gap over the x axis, hence we add a panel
		
		g2D.drawRect(300, 20, 100, 100);
		g2D.clearRect(30, 100, 250, 250);
		g2D.fillRect(300, 250, 100, 100);
		
		g2D.setPaint(Color.black);
		g2D.drawOval(150, 150, 100, 100);
		g2D.fillOval(175, 175, 50, 50);
		
		g2D.drawArc(0, 0, 120, 120, 180, 180);
		
		g2D.drawString("U r an artist", 150, 100);
	}
}