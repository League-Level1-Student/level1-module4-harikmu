import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslatorRunner implements ActionListener {
	public static void main(String[] args) throws Exception {
		PigLatinTranslatorRunner piglatintranslator = new PigLatinTranslatorRunner();
		piglatintranslator.translator();
}
	JFrame f = new JFrame();
	JButton b = new JButton();
	JPanel p = new JPanel();
	JTextField t1 = new JTextField(10);
	JTextField t2 = new JTextField(10);
	PigLatinTranslator translator = new PigLatinTranslator();

	private void translator() {
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.add(p);
		b.setText("translator");
		p.add(t1);
		p.add(b);
		p.add(t2);		
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b) {
			t2.setText(translator.translate(t1.getText()));
		}
	}

}