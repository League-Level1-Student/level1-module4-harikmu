package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener{
	Calculator calc;
	View view;
	
	Controller(Calculator calc, View view){
		this.view = view;
		this.calc = calc;
		view.show();
		view.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if(b.getText().equals("add")) {
			int answer = calc.add(Integer.parseInt(view.getTextFromT1()), Integer.parseInt(view.getTextFromT2()));
			view.setTextOfJLabel(answer+"");
		}
		if(b.getText().equals("sub")) {
			int answer = calc.subtract(Integer.parseInt(view.getTextFromT1()), Integer.parseInt(view.getTextFromT2()));
			view.setTextOfJLabel(answer+"");
		}
		if(b.getText().equals("mul")) {
			int answer = calc.multiply(Integer.parseInt(view.getTextFromT1()), Integer.parseInt(view.getTextFromT2()));
			view.setTextOfJLabel(answer+"");
		}
		if(b.getText().equals("div")) {
			int answer = calc.divide(Integer.parseInt(view.getTextFromT1()), Integer.parseInt(view.getTextFromT2()));
			view.setTextOfJLabel(answer+"");
		}
	}

}
