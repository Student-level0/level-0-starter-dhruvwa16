package day1;

import javax.swing.JOptionPane;

public class Ages {
  public static void main(String[] args) {
	String s = JOptionPane.showInputDialog(null, "What is your age");
	int age = Integer.parseInt(s);
	for (int i = 0; i < age; i++) {
		System.out.println(2017-(age-i));
		
	}

	}
}

