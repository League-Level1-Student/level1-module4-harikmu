import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
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
		if (e.getSource()==firstButton) {
			showPictureFromTheInternet("https://i.pinimg.com/736x/56/47/18/564718a569b742866eb2f811fc2a884c.jpg");
		}
		if (e.getSource()==secondButton) {
			showPictureFromTheInternet("https://storage.googleapis.com/fl-media/photo%2F6%2F25%2F92%2Fpervi_69%2F1208983391_f.jpg?GoogleAccessId=legacy-storage%40fotolog-web.iam.gserviceaccount.com&Expires=1540771200&Signature=gC2hXMT4SbX6jXVtOZiwZAOxFimHHA17vVs5MvclnrLyVTG%2BdzWWW4PLr3V3Tz%2F%2BWYfFOEszDweFu7aIbscuspNU28MppztwBjHTDcxwVsncjblQ328ChiLTakhptHgr5R6v0d83p001WkH65uqMoDQtuw4w%2B9fCcER9ACeOKkXIMBJ7%2FyH3KW%2Fgy7uGpkiV1KBcvoWoPnYsbWWwS7vTnpN36Kz%2FuP%2B2TzRr6BKctRyuN%2Buk6SDIDV1%2BwKaLr7ui1md0LnP8D2sjM79lvQCmR%2FGXkVixnPuoh6iaqtA4E975f%2Fnj%2BZiRLnF5Erxl5ZbkEmTwz1J8dJdYxZsQ1qKGfg%3D%3D");
		}
	} 
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

}
	