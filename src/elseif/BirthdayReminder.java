
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "August 26th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String person = JOptionPane.showInputDialog("WHo's birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.println(person + "'s birthday:");
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		if (person.equals("mom")) {
			System.out.println(momsBirthday);
		}
		if (person.equals("dad")) {
			System.out.println(dadsBirthday);
		}
		if (person.equals("mine")) {
			System.out.println(myBirthday);
		}

	} 
}
