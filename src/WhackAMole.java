import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	public static void main(String[] args) throws Exception {
		WhackAMole whackamole = new WhackAMole();
		whackamole.mole();
		Random generator = new Random();
		whackamole.drawButtons(generator.nextInt(6));
}
	
	JFrame f = new JFrame();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JPanel p = new JPanel();
	private void mole() {
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(150, 250);
		f.add(p);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	private void drawButtons(int number) {
		if (number == 0) {
			b1.setText("mole!");
		}
		if (number == 1) {
			b2.setText("mole!");
		}
		if (number == 2) {
			b3.setText("mole!");
		}
		if (number == 3) {
			b4.setText("mole!");
		}
		if (number == 4) {
			b5.setText("mole!");
		}
		if (number == 5) {
			b6.setText("mole!");
		}
	}
	public void reset() {
		b1.setText(null);
		b2.setText(null);
		b3.setText(null);
		b4.setText(null);
		b5.setText(null);
		b6.setText(null);
		Random generator = new Random();
		drawButtons(generator.nextInt(6));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1 && b1.getText() != "mole!") {
			System.out.println("you missed!");
			f.dispose();
		}
		if (e.getSource() == b2 && b2.getText() != "mole!") {
			System.out.println("you missed!");
			f.dispose();
		}
		if (e.getSource() == b3 && b3.getText() != "mole!") {
			System.out.println("you missed!");
			f.dispose();
		}
		if (e.getSource() == b4 && b4.getText() != "mole!") {
			System.out.println("you missed!");
			f.dispose();
		}
		if (e.getSource() == b5 && b5.getText() != "mole!") {
			System.out.println("you missed!");
			f.dispose();
		}
		if (e.getSource() == b6 && b6.getText() != "mole!") {
			System.out.println("you missed!");
			f.dispose();
		}
		reset();

	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date(0);
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	
}