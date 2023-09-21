package BroCodeProjects;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

public class KeyBindingsDemo {
	
	/* Key Binding = bind an action to perform through a keystroke from keyboard
	 * all Swing components use the Key Bindings these have increased flexibility than Key Listeners
	 * we can assign different key to individual components
	 * The major drawback it is hard to utilize and set up
	 */
	
	public static void main(String[] args) {
		
		 new KeyAction();
		
	}
}

class KeyAction{
	
	JFrame frame= new JFrame();
	JLabel label= new JLabel();

					// the action used in this from swing package and not from awt
	Action upward;
	Action left;
	Action right;
	Action down;
	
	public KeyAction() {
		
		frame.setTitle("Key Binding");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		label.setBackground(Color.red);
		label.setBounds(10, 10, 100, 100);
		label.setOpaque(true);
		
		upward= new UpAction();
		left= new LeftAction();
		right= new RightAction();
		down= new DownAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "UpAction");
		label.getActionMap().put("UpAction", upward);
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "LeftAction");
		label.getActionMap().put("LeftAction", left);
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "RightAction");
		label.getActionMap().put("RightAction", right);
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "DownAction");
		label.getActionMap().put("DownAction", down); 
		
		
		frame.add(label);
	}
	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			 label.setLocation(label.getX(),label.getY()-10);
		} 
	}
	
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()-10, label.getY());
		}
	}
	
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()+10, label.getY());
		}
	}
	
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY()+10);
		}
		
	}
}