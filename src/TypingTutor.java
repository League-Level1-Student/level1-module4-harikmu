import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javafx.scene.layout.Background;
import sun.launcher.resources.launcher;

public class TypingTutor implements KeyListener {
	public static void main(String[] args) throws Exception {
		TypingTutor typingtutor = new TypingTutor();
		typingtutor.currentLetter();
		
}
JFrame j = new JFrame();
JLabel l = new JLabel();
char currentLetter;
private void currentLetter() {
		// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	j.setVisible(true);
	j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
	j.setSize(500, 500);
	j.add(l);
	l.setText(""+currentLetter);
	l.setFont(j.getFont().deriveFont(28.0f));
    l.setHorizontalAlignment(JLabel.CENTER);
    j.addKeyListener(this);
}

char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("you typed: " + currentLetter);
	if(e.getKeyChar() == currentLetter) {
		l.setBackground(Color.MAGENTA);
		l.setOpaque(true);
		System.out.println("correct");
	}
	if(e.getKeyChar() != currentLetter) {
		l.setBackground(Color.orangfse);
		l.setOpaque(true);
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	l.setText(""+currentLetter);
	
}
}




	