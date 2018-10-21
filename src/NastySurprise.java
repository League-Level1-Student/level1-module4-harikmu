import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	public static void main(String[] args) throws Exception {
		NastySurprise nastysurprise = new NastySurprise();
		nastysurprise.trickOrTreat();
	}
	JFrame j = new JFrame();
	JButton firstButton = new JButton();
	JButton secondButton = new JButton();;
	JPanel p = new JPanel();
	private void trickOrTreat() {
		j.setVisible(true);
		j.setSize(500, 500);
		j.add(p);
		p.add(firstButton);
		p.add(secondButton);
		firstButton.setText("Trick");
		secondButton.setText("Treat");
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} 

}
	