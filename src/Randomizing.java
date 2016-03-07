import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Randomizing implements KeyListener{
JFrame f1;
JPanel p1;
JLabel l1;
	public static void main(String[] args) {
		Randomizing v = new Randomizing(); 
			
		
	}
	Randomizing(){
		f1 = new JFrame();
		p1 = new JPanel();
		f1.add(p1);
		f1.setVisible(true);
		f1.setSize(500, 500);
		f1.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		Random r = new Random();
		int num = r.nextInt(256);
		int one = r.nextInt(256);
		int two = r.nextInt(256);
		p1.setBackground(new Color(num, one, two));
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

}
