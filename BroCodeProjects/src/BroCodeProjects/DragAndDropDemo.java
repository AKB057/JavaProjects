 package BroCodeProjects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DragAndDropDemo {
	
	public static void main(String[] args) {
		new DragFrame();
	}
}

class DragFrame extends JFrame{
	
	DragPanel drapgp= new DragPanel();
	
	public DragFrame() {
		
		this.setTitle("Drag and Drop Demo");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.add(drapgp);
	}
}

class DragPanel extends JPanel{
	
	ImageIcon icon= new ImageIcon("HappyEmo.PNG");
	
	final int width= icon.getIconWidth();
	final int height= icon.getIconHeight();
	Point imageCorner;
	Point prevPt;
	
	DragPanel() {
		
		imageCorner= new Point(0,0);
		ClickListner click= new ClickListner();
		DragListener drag= new DragListener();
		this.addMouseListener(click);
		this.addMouseMotionListener(drag);
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		icon.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	
	private class ClickListner extends MouseAdapter{
		
		public void mousePressed(MouseEvent e)
		{
			prevPt= e.getPoint();
		}
	}
	
	private class DragListener extends MouseMotionAdapter{
		
		public void MouseDragged(MouseEvent e)
		{
			Point current= e.getPoint();
			imageCorner.translate(
									(int) ((int)(current.getX())-prevPt.getX()), 
									(int)(current.getY()-prevPt.getY())
									);
			prevPt= current;
			repaint();
		}
	}
	
}