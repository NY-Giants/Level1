import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorGUI implements ActionListener{

	public static void main(String[] args) {

		CalculatorGUI GUI = new CalculatorGUI();
	}

	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button2;
	JButton button3;
	JButton button4;
	JTextField text;
	JTextField texting;
	JLabel label;
	CalculatorGUI() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		text = new JTextField(25);
		texting = new JTextField(25);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.setVisible(true);
		button.setText("divide");
		button2.setText("multiply");
		button3.setText("subtract");
		button4.setText("add");
		panel.add(text);
		panel.add(texting);
		label = new JLabel();
		panel.add(label);
		frame.setSize(500, 500);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			String w = text.getText();
			int z = Integer.parseInt(w);
		}
		if(e.getSource() == button2){
			
		}
		if(e.getSource() == button3){
			
		}
		if(e.getSource() == button4){
			
		}
	}
}