package BroCodeProjects;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonDemo {

	public static void main(String[] args) {
		
		new JRadioFrame();
	}
}

class JRadioFrame  extends JFrame implements ActionListener{
	
	JRadioButton pizza;
	JRadioButton burger;
	JRadioButton hotDog;
	
	public JRadioFrame() {
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(100,100);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new FlowLayout());
		
		pizza = new JRadioButton("pizza");
		burger= new JRadioButton("Burger");
		hotDog= new JRadioButton("HotDog");
		
		pizza.addActionListener(this);
		burger.addActionListener(this);
		hotDog.addActionListener(this);
		
		ImageIcon pizzaicon= new ImageIcon("pizza.png");
		ImageIcon burgericon= new ImageIcon("burger.png");
		ImageIcon hotDogicon= new ImageIcon("hotdog.png");
		
		pizza.setIcon(pizzaicon);
		burger.setIcon(burgericon);
		hotDog.setIcon(hotDogicon);
		
		ButtonGroup group= new ButtonGroup();
		
		group.add(pizza);
		group.add(hotDog);
		group.add(burger);
		
		this.add(pizza);
		this.add(burger);
		this.add(hotDog);
		
		this.pack();
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizza)
		{
			System.out.println("You have selected pizza");
		}
		else if(e.getSource()== burger)
		{
			System.out.println("You have selected burger");
		}
		else {
			System.out.println("You have selected hotdog");
		}
		
	}
	
}