
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 25th";
		String dadsBirthday = "February 5th";
		String myBirthday = "January 17th";

		// 2. Find out which birthday the user wants and and store their response in a variable
			String answer = JOptionPane.showInputDialog("Who's birthday would you like to see?");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, answer);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(answer.equals ("moms")){
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		
		// 5. if user asked for "dad"
			// print dad's birthday
		if(answer.equals ("dads")){
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		if(answer.equals ("mine")){
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else{
			JOptionPane.showMessageDialog(null, "Sorry I dont remember that person's birthday!");} 
		}
}
