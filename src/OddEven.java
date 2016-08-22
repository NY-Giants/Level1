import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OddEven implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton odd;
	JButton even;
	JLabel label;
	JLabel label2;
	Random R = new Random();

	public static void main(String[] args) {
		OddEven oe = new OddEven();

	}

	OddEven() {
		frame = new JFrame();
		panel = new JPanel();
		odd = new JButton("Odd");
		even = new JButton("Even");
		label = new JLabel();
		label2 = new JLabel();
		frame.add(panel);
		panel.add(odd);
		panel.add(even);
		panel.add(label);
		panel.add(label2);
		frame.setVisible(true);
		frame.setSize(500, 500);
		odd.addActionListener(this);
		even.addActionListener(this);
		label.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == odd) {

			int rand = R.nextInt(1010);
			rand *= 2;
			rand++;
			label.setText(rand + "");

		}
		if (e.getSource() == even) {

			int rando = R.nextInt(1010);
			rando*=2;
			label.setText(rando + "");
			
		}
	}

}
