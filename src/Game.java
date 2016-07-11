import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game implements ActionListener {
JFrame frame;
JPanel panel;
JButton button;
JButton button1;
JButton button2;
JButton button3;
JButton button4;
JButton button5;
JButton button6;
JButton button7;
JButton button8;
JButton button9;
JButton button10;
JButton button11;
JButton button12;
JButton button13;
JButton button14;
JButton button15;
	public static void main(String[] args) {
		Game game = new Game();

	}
Game(){
	 frame = new JFrame();
	 panel = new JPanel();
	 button = new JButton();
	 button1 = new JButton();
	 button2 = new JButton();
	 button3 = new JButton();
	 button4 = new JButton();
	 button5 = new JButton();
	 button6 = new JButton();
	 button7 = new JButton();
	 button8 = new JButton();
	 button9 = new JButton();
	 button10 = new JButton();
	 button11 = new JButton();
	 button12 = new JButton();
	 button13 = new JButton();
	 button14 = new JButton();
	 button15 = new JButton();
	frame.add(panel);
	panel.add(button);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(button5);
	panel.add(button6);
	panel.add(button7);
	panel.add(button8);
	panel.add(button9);
	panel.add(button10);
	panel.add(button11);
	panel.add(button12);
	panel.add(button13);
	panel.add(button14);
	panel.add(button15);
	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);
	button6.addActionListener(this);
	button7.addActionListener(this);
	button8.addActionListener(this);
	button9.addActionListener(this);
	button10.addActionListener(this);
	button11.addActionListener(this);
	button12.addActionListener(this);
	button13.addActionListener(this);
	button14.addActionListener(this);
	button15.addActionListener(this);
	frame.setVisible(true);
	frame.setSize(350, 175);
	Random Buttons = new Random();
	int Rand = Buttons.nextInt(16);
	int totalbuttons = 16;
	JButton specialButton = new JButton();
	specialButton.addActionListener(this);
	for (int i = 0; i < totalbuttons; i++){
		if(i == Rand){
			panel.add(specialButton);
		}
		else{
			JButton losebutton = new JButton();
			losebutton.addActionListener(this);
			panel.add(losebutton);
		}
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button4|| e.getSource()==button12){
		JOptionPane.showInputDialog("You Won");
		
	}
	else{
		JOptionPane.showInputDialog("You lost:(");
	}
	
}
}
