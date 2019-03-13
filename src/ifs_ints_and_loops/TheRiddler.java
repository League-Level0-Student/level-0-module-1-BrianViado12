package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
			int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
			while (score==0)
			{
			String input = JOptionPane.showInputDialog("What has four fingers and a thumb, but is not alive?");
				if(input.equalsIgnoreCase("Glove") || input.equalsIgnoreCase("Gloves"))
					{	
				JOptionPane.showMessageDialog(null, "Correct!");
			score=score+1;
			}else 
			{
				JOptionPane.showMessageDialog(null, "Try Again");
			
			}
				}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
			while (score==1)
			{
			String input = JOptionPane.showInputDialog("Give me food and I will live. Give me water and I will die. What am I?");
				if(input.equalsIgnoreCase("Fire"))
					{	
				JOptionPane.showMessageDialog(null, "Correct!");
			score=score+1;
			}else 
			{
				JOptionPane.showMessageDialog(null, "Try Again");
			
			}
				}
			
			while (score==2)
			{
			String input = JOptionPane.showInputDialog("What gets wet when it's drying?");
				if(input.equalsIgnoreCase("Towel"))
				{	
					JOptionPane.showMessageDialog(null, "Correct!");
				score=score+1;
				}else 
				{
					JOptionPane.showMessageDialog(null, "Try Again");
				
				}
					}
						
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
	}

