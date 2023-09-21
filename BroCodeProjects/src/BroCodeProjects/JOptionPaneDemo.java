package BroCodeProjects;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPaneDemo {
	
	//JOptionPane is a pop up standard dialog box that prompts users for value or provides information 
	
	public static void main(String[] args) {
		
		JOptionPane option= new JOptionPane();
		
	/*	option.showMessageDialog(null, "This is a plain message","Your Message", option.PLAIN_MESSAGE);
		
		option.showMessageDialog(null, "This is information","Your Message", option.INFORMATION_MESSAGE);
		
		option.showMessageDialog(null, "This is a question","Your Message", option.QUESTION_MESSAGE);
		
		option.showMessageDialog(null, "This is a warning  message","Your Message", option.WARNING_MESSAGE);
		
		option.showMessageDialog(null, "This is error",	"Your Message", option.ERROR_MESSAGE);
		
	//  if we require to not close it, we can simply put this is in a while loop
		
		while(true)
		{
			option.showMessageDialog(null, "Njn poovuladaa", "Message vannind", option.WARNING_MESSAGE);
		}
	*/
		int answer= option.showConfirmDialog(null, "Do you want to open a new window", "Base window", option.YES_NO_CANCEL_OPTION);
		
		if(answer==0)
		{
			System.out.println("object opened");
		}	
		
		String name= option.showInputDialog("what is your name");
		
		System.out.println(name);
		
		String[] responses= {"hello Amigo", "Hola Sen", "Byee"};
		ImageIcon icon = new ImageIcon("HappyEmo.png");
		
		option.showOptionDialog(null, "Hello", "Title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 1);
	}
}