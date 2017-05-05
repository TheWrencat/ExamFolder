import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {
	JButton butY = new JButton();
	JButton butR = new JButton();
	JButton butB = new JButton();
	JButton butG = new JButton();
	private void setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(butY);
		panel.add(butR);
		panel.add(butB);
		panel.add(butG);
		
		butY.setBackground(Color.yellow);
		butY.setOpaque(true);
		butR.setBackground(Color.red);
		butR.setOpaque(true);
		butB.setBackground(Color.blue);
		butB.setOpaque(true);
		butG.setBackground(Color.green);
		butG.setOpaque(true);
		
		butY.addActionListener(this);
		butR.addActionListener(this);
		butB.addActionListener(this);
		butG.addActionListener(this);
		
		frame.pack();
		
	}
	
	void speak(String words){
		try{
			Runtime.getRuntime().exec("say" + " " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ColorTeacher colorTeacher = new ColorTeacher();
		colorTeacher.setup();
	}

	@Override
	public void actionPerformed(ActionEvent argO) {
		if((butY) == argO.getSource()){
			speak("Yellow");
		}
		if((butR) == argO.getSource()){
			speak("Red");
		}
		if((butG) == argO.getSource()){
			speak("Green");
		}
		if((butB) == argO.getSource()){
			speak("Blue");
		}
		
	}
	
}
