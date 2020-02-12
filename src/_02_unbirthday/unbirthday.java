package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		
	String birthday = JOptionPane.showInputDialog(null,"when is your birthday?");  
	if (birthday.equals("11/30")) { 
		JOptionPane.showMessageDialog(null,"Happy Birthday!");
	} else {
		JOptionPane.showMessageDialog(null, "I wish you a very Unbirthday!!");
		for (int i = 0; i < args.length; i++) {
			
		}
	}	
	}
}
