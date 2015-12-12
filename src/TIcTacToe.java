import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TIcTacToe  implements ActionListener {
 JFrame A;
 JPanel AB;
 JButton B;
 JButton C;
 JButton D;
 JButton E;
 JButton F;
 JButton G;
 JButton H;
 JButton I;
 JButton J;
 JButton K;
 String buttonText = "x";
 
	public static void main(String[] args) {
	
		TIcTacToe w = new TIcTacToe();
	}
		TIcTacToe(){
		A = new JFrame();
		AB = new JPanel();
		B = new JButton();
		C = new JButton();
		D = new JButton();
		E = new JButton();
		F = new JButton();
		G = new JButton();
		H = new JButton();
		I = new JButton();
		J = new JButton();
		K = new JButton();
		A.setVisible(true);
		A.setSize(250, 175);
		A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		K.setText("Click to switch to Player Two");
		A.add(AB);
		AB.add(B);
		AB.add(C);
		AB.add(D);
		AB.add(E);
		AB.add(F);
		AB.add(G);
		AB.add(H);
		AB.add(I);
		AB.add(J);
		AB.add(K);
		B.addActionListener(this);
		C.addActionListener(this);
		D.addActionListener(this);
		E.addActionListener(this);
		F.addActionListener(this);
		G.addActionListener(this);
		H.addActionListener(this);
		I.addActionListener(this);
		J.addActionListener(this);
		K.addActionListener(this);

	}
	

@Override
public void actionPerformed(ActionEvent e) {
	if( B  == e.getSource()){
			B.setText(buttonText);
			
		}

		if( C == e.getSource()){
				C.setText(buttonText);		
	}
		
		if( D  == e.getSource()){
				D.setText(buttonText);
			}
		if( E == e.getSource()){
		
				E.setText(buttonText);
				
			}
		
		if( F  == e.getSource()){
			
				F.setText(buttonText);
			
			}
		
		if( G  == e.getSource()){
			
				G.setText(buttonText);
				
			}
		
		if( H  == e.getSource()){
	
				H.setText(buttonText);
			
			}
		
		if( I  == e.getSource()){
		
				I.setText(buttonText);
			
			}
		
		if( J  == e.getSource()){
			
				J.setText(buttonText);
				
			}
		if(K == e.getSource()){
		if (buttonText.equals ("o"))
			buttonText ="x";
		else{
			buttonText ="o";
		}
}
	
}
}