package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static void drawSqaure(Robot robo){
		for (int i = 0; i < 4; i++) {
			robo.move(200);
			robo.turn(90);
		}
	}
	static void drawTriangle(Robot robo){
		for (int i = 0; i < 3; i++) {
			robo.move(200);
			robo.turn(120);
		}
	}
	static void drawCircle(Robot robo){
		for (int i = 0; i < 100; i++) {
			robo.move(10);
			robo.turn(10);
		}
	}
	public static void main(String[] args) {
		Robot robo = new Robot("mini");
		robo.show();
		robo.setSpeed(10);
		robo.setX(200);
		robo.setY(250);
		robo.penDown();
		robo.setPenWidth(200);
		String command = JOptionPane.showInputDialog("What do you want the Robot to do?");
		String color = JOptionPane.showInputDialog("What color?(green or red or blue)");
		if (color.equals("green")) {
			robo.setPenColor(0, 255, 0);
		}
		else if (color.equals("blue")) {
			robo.setPenColor(0, 0, 255);
		}
		else if (color.equals("red")) {
			robo.setPenColor(255, 0, 0);
		}
		else {
			robo.setRandomPenColor();
		}
		if (command.equals("circle")) {
			drawCircle(robo);
		}
		else if (command.equals("square")) {
			drawSqaure(robo);
		}
		else if (command.equals("triangle")) {
			drawTriangle(robo);
		}
		else {
			System.out.println("Error has occered");
		}
		robo.hide();
	}

}
