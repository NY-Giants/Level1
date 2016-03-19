import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChuckleClicker implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton d1;
	JButton d2;

	public static void main(String[] args) {
		ChuckleClicker clicker = new ChuckleClicker();

	}

	ChuckleClicker() {
		frame = new JFrame();
		panel = new JPanel();
		d1 = new JButton("Joke");
		d2 = new JButton("Punchline");
		frame.setVisible(true);
		frame.setSize(150, 100);
		frame.add(panel);
		panel.add(d1);
		panel.add(d2);
		d1.addActionListener(this);
		d2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (d1 == e.getSource()) {
			System.out.println("What is the most harmful part of a joke");
			
		}

	@Override
	public void actionPerformed1(ActionEvent e) {
		if (d2 == e.getSource()) {
			System.out.println("What is the most harmful part of a joke");
		}
	}
}
/*
 * Make a ChuckleClicker class, a main method and a makeButtons method. Put a pop-up in the makeButtons method and get
 * it working. You will need to instantiate your class and call method an instance of it.
 * 
 * Make a JFrame in makeButtons() method and get it to show.
 * 
 * Add a JPanel and two JButtons and get them to show up like this:
 * 
 * [Optional] Customize your GUI with setText, setSize, etc.
 * 
 * Make a pop-up that says “hi” when either of the buttons are pressed. You will need to add listeners to the buttons
 * for this to work.
 * 
 * Check if the ActionEvent came from the joke button or the punchline button. if(arg0.getSource() == jokeButton) You
 * might need to move the declaration of your buttons above the the makeButtons() method.
 * 
 * Use JOptionPane to print the joke or the punchline depending on which button was clicked.
 */
