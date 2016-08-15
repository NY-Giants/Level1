import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OddEven {
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button2;

	public static void main(String[] args) {
		OddEven oe = new OddEven();

	}

	OddEven() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("Odd");
		button2 = new JButton("Even");
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		frame.setVisible(true);
		frame.setSize(500, 500);

	}

}
