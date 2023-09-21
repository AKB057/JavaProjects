package BroCodeProjects;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboDemo {
	
	// JComboBox is a GUI component to hold components as a drop down menu to select from various options with in built functions 
	
	public static void main(String[] args) {
		new ComboFrame();
	}

}

class ComboFrame extends JFrame implements ActionListener{
	
	JComboBox<String> combo;
	JComboBox<Integer> combonums;
	
	public ComboFrame() {
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(new FlowLayout()); 
		
		String[] animals= {"dog","cat", "bird"};
		Integer[] nums= {1,2,3,4};
		
		
		combo= new JComboBox<>(animals);
		combonums= new JComboBox(nums);
		
		this.add(combo);
		this.add(combonums);
		
		combo.addActionListener(this);
		
		/*	System.out.println(combo.getItemCount()); // to get all items in the box menu
		combo.addItem("Horse");						  // to add an item into the menu
		combo.insertItemAt("pig", 1);				  // to insert an item at a position	
		z  
		combo.removeItem("cat");					  // removing a single item, or an item at a position or everything	
		combo.removeItemAt(1);
		combo.removeAll();
	*/
		
		this.pack();
		this.setLocationRelativeTo(null);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==combo)
		{
			System.out.println("You have selected "+combo.getSelectedItem());
			System.out.println("The selected is in index position "+combo.getSelectedIndex());
		}
		
	}
	
}
