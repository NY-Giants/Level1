import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class KeyPractice implements KeyListener {
	JFrame frame;
	public static void main(String[] args) {
		KeyPractice h = new KeyPractice();

	}
KeyPractice(){
	frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(624, 354);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.addKeyListener(this);
	
	
}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, (char)e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
