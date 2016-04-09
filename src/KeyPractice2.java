import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyPractice2  implements KeyListener {
JLabel label;
JFrame frame;
JPanel panel;
String typedStuff = "";



	public static void main(String[] args) {
		KeyPractice2 lol = new KeyPractice2();
			
	}
		
KeyPractice2(){
	
	panel = new JPanel();
	frame = new JFrame();
	label = new JLabel();
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.addKeyListener(this);
	panel.add(label);
	
	
	}
@Override
public void keyTyped(KeyEvent e) {
	
	
}
@Override
public void keyPressed(KeyEvent e) {
	typedStuff +=  e.getKeyChar();
label.setText(typedStuff);
 if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
	//if(updated > 1){
	 String updated = typedStuff.substring(0, typedStuff.length()-2);
	typedStuff = updated;
	label.setText(updated);
	
	//}
 
	
	
}
	
}
@Override
public void keyReleased(KeyEvent e) {
	

}

}
