package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {


public static void main(String[] args) {

		// 1. Save thesuper power for each person in a variable.
		String PETA = "PETA";
		String PETASUPER = "Having everyone hate them";
		String Jacksepticeye = "Jacksepticeye";
		String JACKSEPTICEYESUPER = "Roasting";
		String Pewdiepie = "Pewdiepie";
		String PEWDIEPIESUPER = "Memes and destroying memes";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String guess = JOptionPane.showInputDialog("Type in name");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
		if (guess.equals(PETA)) {
			JOptionPane.showMessageDialog(null, PETASUPER);
		}
		if (guess.equals(Jacksepticeye)) {
			JOptionPane.showMessageDialog(null,  JACKSEPTICEYESUPER);
		
		}
			if (guess.equals(Pewdiepie)) {
			JOptionPane.showMessageDialog(null, PEWDIEPIESUPER);
		}
			
			
		}
		
	}


