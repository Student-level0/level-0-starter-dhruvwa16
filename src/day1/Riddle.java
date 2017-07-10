package day1;

import javax.swing.JOptionPane;

public class Riddle {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("I drink, I die. I eat and I am fine. What am I?");
	if(a.equals("fire") ){
		JOptionPane.showMessageDialog(null, "Correct");
	}
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
			JOptionPane.showMessageDialog(null, "The correct answer is fire");
		
		}
	}
	}


