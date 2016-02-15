import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Factors implements ActionListener{
JFrame f1;
JPanel p1;
JButton b1;
JTextField tf1;
String D = "";

	public static void main(String[] args) {
		Factors Factors = new Factors();

	}
	Factors(){
		f1 = new JFrame();
		p1 = new JPanel();
		b1 = new JButton("Submit");
		tf1 = new JTextField(11);
		f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
		f1.add(p1);
		p1.add(b1);
		p1.add(tf1);
		b1.addActionListener(this);
		f1.setVisible(true);
		f1.setSize(300, 300);
		b1.setText("Submit");
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1 ){
			D = "";
			String v = tf1.getText();
			int y = Integer.parseInt(v);
			for(int i = 1; i <= y; i++){
				if(y%i == 0){
					 D += "" + i + ",";
				}
			}
			JOptionPane.showMessageDialog(null,  D);
		}
		
	}
}
