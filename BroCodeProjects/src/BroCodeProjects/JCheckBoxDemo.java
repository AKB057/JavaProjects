package BroCodeProjects;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxDemo {
	public static void main(String[] args) {
		
		new CheckFrame();
	}

}

class CheckFrame extends JFrame implements ActionListener{

	JCheckBox check;
	JButton button;
	public CheckFrame() {
		
		check= new JCheckBox("I am not a robot");
		button= new JButton("Submit");
		
		check.addActionListener(this);
		button.addActionListener(this);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(check);
		this.add(button);
		
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==check)
		{
			if(check.isSelected())
		{
			System.out.println("Going forward....");
		}
		}
		
		if(e.getSource()==button)
		{
			if(check.isSelected())
			{
				System.out.println("logging you in...");
			}
			else {
				System.out.println("please check the box");
			}
		}
		
		
		
	}
	
}
