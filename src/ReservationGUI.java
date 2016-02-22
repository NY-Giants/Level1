import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ReservationGUI {
JButton d1;
JLabel l1;
JLabel l2;
JLabel l3;
JTextField jtf1;
JTextField jtf2;
JTextField jtf3;
JFrame f1;
JPanel p1;

	public static void main(String[] args) {
		ReservationGUI reservationGUI = new ReservationGUI();

	}
ReservationGUI(){
	JButton d1 = new JButton();
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JTextField jtf1 = new JTextField(40);
	JTextField jtf2 = new JTextField(40);
	JTextField jtf3 = new JTextField(40);
	JFrame f1 = new JFrame();
	JPanel p1 = new JPanel();
	f1.add(p1);
	p1.add(l1);
	p1.add(l2);
	p1.add(l3);
	p1.add(d1);
	p1.add(jtf1);
	p1.add(jtf2);
	p1.add(jtf3);
	f1.setVisible(true);
	f1.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
	f1.setSize(500,500);
	jtf1.setText("Name");
	jtf2.setText("Total");
	jtf3.setText("Date");
	d1.setText("Submit");

	
}
}
