	import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


	public class myfirstGUI implements ActionListener
	{
	JFrame window;
	JPanel panel;
	JButton button;
	JButton buttons;
	JTextField text;
	public static void main(String[] args) {
		myfirstGUI x = new myfirstGUI();		
	}
	myfirstGUI(){	
	window = new JFrame();
	window.setVisible(true);
	window.setSize(500,500);
	window.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
	panel = new JPanel();
	window.add(panel);
	button = new JButton("I like freight trains");
	panel.add(button);
	button.addActionListener(this);
	buttons = new JButton("I like Trains");
	panel.add(buttons);
	buttons.addActionListener(this);
	text = new JTextField(10);
	panel.add(text);
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==button){
		//System.out.println("boom");	
		JOptionPane.showMessageDialog(null, text.getText());
		}
		//if(e.getSource()==buttons){
		//System.out.println("bang");
		
		
		//}
		
	}
	}




