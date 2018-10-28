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

public class TypingTutor implements ActionListener {
	public static void main(String[] args) throws Exception {
		TypingTutor typingtutor = new TypingTutor();
		typingtutor.makeButtons();
	}
	JFrame j = new JFrame();
	private void makeButtons() {
		j.setVisible(true);
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
		j.setSize(500, 500);


	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
	}