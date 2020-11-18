package _01_Basic;

import javax.swing.*;

public class FirstSwingExample {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JButton button = new JButton("Click me");
		button.setBounds(100, 100, 120, 32);

	 	frame.add(button);
	 	
	 	frame.setSize(400, 500);
	 	frame.setLayout(null);
	 	frame.setVisible(true);
	}

}
