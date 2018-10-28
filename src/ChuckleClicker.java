import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) throws Exception {
		ChuckleClicker chuckleclicker = new ChuckleClicker();
		chuckleclicker.makeButtons();
	}
	JFrame j = new JFrame();
	JButton firstButton = new JButton();
	JButton secondButton = new JButton();;
	JPanel p = new JPanel();
	private void makeButtons() {
		j.setVisible(true);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.setSize(500, 500);
		j.add(p);
		p.add(firstButton);
		p.add(secondButton);
		firstButton.setText("joke");
		secondButton.setText("punchline");
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==firstButton || e.getSource()==secondButton) {
			JOptionPane.showMessageDialog(null, "hi");
		}
		if(e.getSource() == firstButton) {
			System.out.println("joke");
		}
		if(e.getSource() == secondButton) {
			System.out.println("punchline");
		}


	}
}