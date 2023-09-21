package BroCodeProjects;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuBarDemo {
	
	public static void main(String[] args) {
		new MenuFrame();
	}
}

class MenuFrame extends JFrame implements ActionListener{
	
	JMenuBar menubar;	//The menu bar is the GUI component in which the menus will be displayed
	JMenu menu1;		//The menu package is used to hold the different types of options for users to users to perform
	JMenu menu2;
	JMenu menu3;
	JMenuItem item1;
	JMenuItem item2;
	JMenuItem item3;
	
	ImageIcon fileicon;
	ImageIcon saveicon;
	ImageIcon exiticon;

	public MenuFrame() {
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setLayout(new FlowLayout());
		
		menubar= new JMenuBar();
		menu1= new JMenu("File");
		menu2= new JMenu("Edit");
		menu3= new JMenu("Help");
		
		item1= new JMenuItem("Load");
		item2= new JMenuItem("Save");
		item3= new JMenuItem("Exit");
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		
		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);
								
								//Set Mnemonic is to define a set shortcut keys to the already provided menu items to fetch immediately 
								//the below mnemonic is set for the menu, we require to press the Alt and Key set for this to work.
		menu1.setMnemonic(KeyEvent.VK_F); // Alt + F
		menu2.setMnemonic(KeyEvent.VK_E); // Alt + E	
		
								//the below mnemonic is set for items inside the menu.we can press the key alone to get the functionality of click
		item1.setMnemonic(KeyEvent.VK_L); // L for load
		item3.setMnemonic(KeyEvent.VK_E); // E for Exit
		
		fileicon= new ImageIcon("load.png");
		saveicon= new ImageIcon("save.png");
		exiticon= new ImageIcon("exit.png");
		
		item1.setIcon(fileicon);
		item2.setIcon(saveicon);
		item3.setIcon(exiticon);
		
		this.add(menubar);
		this.setVisible(true);
		this.setJMenuBar(menubar); // this command is to set the menu bar to the left hand side of the frame. The default position is middle
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==item1)
		{
			System.out.println("The file is loaded");
		}
		if(e.getSource()==item2)
		{
			System.out.println("We are saving your file");
		}
		if(e.getSource()==item3)
		{
			System.exit(0);
			System.out.println("You may exit");
		}
	}
	
}
