package Calculator;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
	JFrame frame = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JTextField t1 = new JTextField(20);
	JTextField t2 = new JTextField(20);
	JLabel l = new JLabel();
	void show() {
		frame.setVisible(true);
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(p);
		b1.setText("add");
		b2.setText("sub");
		b3.setText("mul");
		b4.setText("div");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(t1);
		p.add(t2);
		p.add(l);
	}
	
	String getTextFromT1() {
		return t1.getText();
	}
	
	String getTextFromT2() {
		return t2.getText();
	}
	
	void setTextOfJLabel(String answer) {
		l.setText(answer);
	}
	void addActionListener(ActionListener a) {
		b1.addActionListener(a);
		b2.addActionListener(a);
		b3.addActionListener(a);
		b4.addActionListener(a);
		
	}

	
}
