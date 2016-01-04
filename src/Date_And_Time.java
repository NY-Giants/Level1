import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Date_And_Time implements ActionListener {
	JFrame frame;
	JButton button;
	JButton button1;
	JPanel panel;

	public static void main(String[] args) {

		Date_And_Time dt = new Date_And_Time();

	}

	Date_And_Time() {

		frame = new JFrame();
		button = new JButton();
		button1 = new JButton();
		panel = new JPanel();
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(500, 500);
		button.setText("date"); 
		button1.setText("time"); 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Calendar cal = Calendar.getInstance();
		String date = cal.getTime().toString();
		if (e.getSource() == button) {

			String hello = date.substring(0, 10);
			System.out.println(hello);
		}
			if (e.getSource() == button1) {

				String budget_cuts = date.substring(11, 23);
				String hour = budget_cuts.substring(0, 2);
				int x = Integer.parseInt(hour);
				if(x > 12){
					x -= 12;
				}
				
				
				
				
			}

		
	}
}
