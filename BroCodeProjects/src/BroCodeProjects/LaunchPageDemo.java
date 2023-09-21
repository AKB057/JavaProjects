package BroCodeProjects;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LaunchPageDemo {
	public static void main(String[] args) {
		
		new LaunchPage();
	}
}

class LaunchPage implements ActionListener{
	
	JFrame frame= new JFrame();
	JButton button= new JButton("New Window");
	
	public LaunchPage() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setLayout(null);
		frame.setVisible(true);
		
		button.setBounds(75, 55, 140, 30);
		button.setFocusable(false);
		button.addActionListener(this);
		
		frame.add(button);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button)
		{
			
			frame.dispose(); // we can open the launch pages on the button click and then terminate the new window pane to restrict user from opening multiple same launch pages
			
			new NewWindow();
			new JLayeredPaneDemo();
			new CheckFrame(); // we can call a constructor to automatically create an object for the same.
			new Frame();
		}
	}
}

class NewWindow{
	
	JFrame frame= new JFrame();
	JLabel label= new JLabel("hello");
	
	public NewWindow() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setLayout(null);
		frame.setVisible(true);
		
		label.setBounds(0,0,100,50);
		label.setFont(new Font(null, Font.BOLD, 30));
		
		frame.add(label);
		frame.setLocationRelativeTo(null);
	}
}