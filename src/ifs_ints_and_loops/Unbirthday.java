package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog(null, "When is your birthday?");
		if (input.equals("3/20/19")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday");
		} else {

			JOptionPane.showMessageDialog(null, "Then have a Merry Unbirthday");

		}

	}
}
