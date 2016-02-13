import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackamoose {
	JButton d1;
	JButton d2;
	JButton d3;
	JButton d4;
	JButton d5;
	JButton d6;
	JButton d7;
	JButton d8;
	JButton d9;
	JButton d10;
	JButton d11;
	JButton d12;
	JButton d13;
	JButton d14;
	JButton d15;
	JButton d16;
	JButton d17;
	JButton d18;
	JButton d19;
	JButton d20;
	JButton d21;
	JButton d22;
	JButton d23;
	JButton d24;
	JPanel p1;
	JFrame f1;
	
	public static void main(String[] args) {
	whackamoose moose = new whackamoose();
	
	}
	void drawButtons(String words){
		{
			try {
			Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
			e.printStackTrace();
			}

			}
	
	}
	whackamoose(){
		f1 = new JFrame();
		p1 = new JPanel();
		d1 = new JButton();
		d2 = new JButton();
		d3 = new JButton();
		d4 = new JButton();
		d5 = new JButton();
		d6 = new JButton();
		d7 = new JButton();
		d8 = new JButton();
		d9 = new JButton();
		d10 = new JButton();
		d11 = new JButton();
		d12 = new JButton();
		d13 = new JButton();
		d14 = new JButton();
		d15 = new JButton();
		d16 = new JButton();
		d17 = new JButton();
		d18 = new JButton();
		d19 = new JButton();
		d20 = new JButton();
		d21 = new JButton();
		d22 = new JButton();
		d23 = new JButton();
		d24 = new JButton();
		f1.add(p1);
		p1.add(d1);
		p1.add(d2);
		p1.add(d3);
		p1.add(d4);
		p1.add(d5);
		p1.add(d6);
		p1.add(d7);
		p1.add(d8);
		p1.add(d9);
		p1.add(d10);
		p1.add(d11);
		p1.add(d12);
		p1.add(d13);
		p1.add(d14);
		p1.add(d15);
		p1.add(d16);
		p1.add(d17);
		p1.add(d18);
		p1.add(d19);
		p1.add(d20);
		p1.add(d21);
		p1.add(d22);
		p1.add(d23);
		p1.add(d24);
		f1.setVisible(true);
		f1.setSize(500, 500);
		
		
	}
	
}

