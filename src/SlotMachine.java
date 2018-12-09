import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	public static void main(String[] args) throws Exception {
		SlotMachine slotmachine = new SlotMachine();
		SlotMachine.reels();
		Random generator = new Random();
		slotmachine.drawButtons(generator.nextInt(6));
}
	JFrame f = new JFrame();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JPanel p = new JPanel();
	private void drawButtons(int nextInt) {
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.add(p);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	private static void reels() {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}