import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Up_Down_Left_Right implements ActionListener {
	JFrame frame;
	JButton buttonup;
	JButton b1down ;
	JButton b2left;
	JButton b3right;
	JPanel panel;
	String Clicked = "";
	public static void main(String[] args) {
		Up_Down_Left_Right v = new Up_Down_Left_Right();
		
	}
	Up_Down_Left_Right(){
		frame = new JFrame();
		buttonup = new JButton();
		b1down = new JButton();
		b2left = new JButton();
		b3right = new JButton();
		panel = new JPanel();
		frame.add(panel);
		panel.add(buttonup);
		panel.add(b1down);
		panel.add(b2left);
		panel.add(b3right);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonup.addActionListener(this);
		b1down.addActionListener(this);
		b2left.addActionListener(this);
		b3right.addActionListener(this);
		buttonup.setText("UP");
		b1down.setText("DOWN");
		b2left.setText("LEFT");
		b3right.setText("RIGHT");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(buttonup == e.getSource()){
			if( !Clicked.equals("UP")) {
				System.out.println("UP");
				Clicked = "UP";
			}
		}
	
			if(b1down == e.getSource()){
				if( !Clicked.equals("DOWN")) {
					System.out.println("DOWN");
					Clicked = "DOWN";
		}
			}
			
			if(b2left == e.getSource()){
				if( !Clicked.equals("LEFT")) {
					System.out.println("LEFT");
					Clicked = "LEFT";
				}
			}
			if(b3right == e.getSource()){
				if( !Clicked.equals("RIGHT")) {
					System.out.println("RIGHT");
					Clicked = "RIGHT";
				}
			}
	}
}

