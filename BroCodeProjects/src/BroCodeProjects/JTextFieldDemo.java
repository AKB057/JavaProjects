package BroCodeProjects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldDemo {
	
	public static void main(String[] args) {
		new TextFrame();
	}

}

class TextFrame extends JFrame implements ActionListener{
	
	JTextField field;
	JTextField field1;
	JButton button;
	
	public TextFrame() {
		
		field= new JTextField("username");
		field1= new JTextField("password");
		button= new JButton("Submit");
		
		
		
		button.addActionListener(this);
		
		field.setPreferredSize(new Dimension(250,40)); 
		field.setFont(new Font("Consolas", Font.PLAIN, 35)); //sets the font to required one from the method
		
		field.setForeground(Color.green);
		field.setOpaque(true);
		field.setBackground(Color.black);
		field.setCaretColor(Color.white); //this sets a color for the cursor in the field
		
		
		field1.setPreferredSize(new Dimension(250,40)); 
		field1.setFont(new Font("Consolas", Font.PLAIN, 35)); //sets the font to required one from the method
		
		field1.setForeground(Color.green);
		field1.setOpaque(true);
		field1.setBackground(Color.black);
		field1.setCaretColor(Color.white); //this sets a color for the cursor in the field
	
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		
		this.add(field);
		this.add(field1);
		this.add(button);
		this.pack();
		this.setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button)
		{
			System.out.println("Welcome "+field.getText());
			button.setEnabled(false);
			field.setEditable(false);
		}
	}
	
}