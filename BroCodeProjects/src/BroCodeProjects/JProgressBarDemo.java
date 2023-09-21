package BroCodeProjects;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JProgressBarDemo {
	
	//JProgressBar is a component used to visualize the progress of a specific operation.
	
	public static void main(String[] args) 
	{
		new ProgressBar();
	}

}

class ProgressBar{
	
	JFrame frame= new JFrame();
	JProgressBar bar= new JProgressBar();
	
	public ProgressBar() {
		
		
		bar.setValue(0);			//this is used to set a value in the progress bar
		bar.setStringPainted(true);
		
		bar.setBounds(20, 20, 350, 50);
		
		bar.setFont(new Font("MV Boli", Font.ITALIC, 20));
		bar.setForeground(Color.white);
		bar.setBackground(Color.BLACK);
		
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);	 
		
		frame.add(bar);
		  	 
		fill();
		
	}
	
	public void fill() {
		int counter=0; 		// we can start the progress from any value and then reduce or increase the bar progress using different ways
		
		while(counter<=100)
		{
			bar.setValue(counter);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter+=10;
		}
		bar.setString("Done :)");
	}
}