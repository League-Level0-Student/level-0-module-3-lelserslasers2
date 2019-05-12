//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		boolean keepGoing = true;
		//1. Create a new Robot
		while (keepGoing) {
		Robot robo = new Robot("mini");
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("Enter color (red or blue or green):");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equals("red")) {
			robo.setPenColor(255, 0 , 0);
		}
		else if(color.equals("blue")) {
			robo.setPenColor(0,0 , 255);
		}
		else if(color.equals("green")) {
			robo.setPenColor(0,255,0);
		}
		else {
			robo.setRandomPenColor();
		}
        //6. If the user doesn’t enter anything, choose a random color
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		robo.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code
		robo.setSpeed(10);
		robo.penDown();
		robo.move(200);
		robo.turn(120);
		robo.move(200);
		robo.turn(120);
		robo.move(200);
		robo.turn(120);
		if (JOptionPane.showInputDialog("Keep going? (t or f:)").equals("f")) {
			keepGoing = false;
		}
	}
	}
}
