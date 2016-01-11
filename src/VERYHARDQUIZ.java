import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VERYHARDQUIZ  implements ActionListener{
JFrame frame;
JPanel panel;
JButton a;
JButton b;

	public static void main(String[] args) {
	VERYHARDQUIZ quiz = new VERYHARDQUIZ();
	
	}
VERYHARDQUIZ(){
	panel = new JPanel();
	frame = new JFrame();
	a = new JButton();
	b = new JButton();
	frame.add(panel);
	panel.add(a);
	panel.add(b);
	frame.setVisible(true);
	frame.setSize(500,500);
	a.addActionListener(this);
	b.addActionListener(this);
	
	
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(a == e.getSource()){
		JOptionPane.showMessageDialog(null, "hello");
	}
	if (b == e.getSource()){
		JOptionPane.showMessageDialog(null, "Goodbye");
	}
}

}
