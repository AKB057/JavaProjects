package BroCodeProjects;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JFileChoosDemo

			// JFileChooser is a GUI mechanism that lets a user choose a file(helpful for opening or saving)
{
	public static void main(String[] args) {
	
		new FileFrame();
	}
	
}

class FileFrame extends JFrame implements ActionListener
{
	JButton button= new JButton("Select a File");;
	
	public FileFrame() {
		
		
		button.setBounds(25, 25, 30, 30);
		button.addActionListener(this);
		button.setFocusable(false);
		
		this.setSize(100,100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		
		this.setLocationRelativeTo(null);
		this.add(button);
		this.setResizable(false);
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== button)
		{
			JFileChooser choose= new JFileChooser();
			
			choose.setCurrentDirectory(new File(".")); // this is to open the dialog box to a specified folder in this case we are using the current project path using .
			
			int response1=choose.showSaveDialog(null);	// method call to open a particular file( response will be an integer and can be checked in case opened
			int response= choose.showOpenDialog(null);	//this is to save a file using the GUI mechanism
			  
			if(response== JFileChooser.APPROVE_OPTION) // we can print the response in case the dialog box opened is closed with or without input.
			{
				File file= new File(choose.getSelectedFile().getAbsolutePath()); //
				System.out.println(file); 
			}
		}
		
	}
	
}