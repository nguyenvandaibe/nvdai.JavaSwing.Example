package _01_Basic;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Simple {
	JFrame frame;
	
	Simple() {
		frame = new JFrame();
		
		JButton button = new JButton("Click me");
		button.setBounds(100, 100, 120, 32);

	 	frame.add(button);
	 	
	 	frame.setSize(400, 500);
	 	frame.setLayout(null);
	 	frame.setVisible(true);
	}
	
	public static void main() {
		new Simple();
	}
}
