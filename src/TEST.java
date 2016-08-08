import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TEST {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JTextField text;

	public static void main(String[] args) {
		TEST test = new TEST();

	}

	TEST() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton("Submit");
		button2 = new JButton("Hint");
		text = new JTextField(100);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(text);

	}
}
