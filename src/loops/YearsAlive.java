package loops;

import javax.swing.JOptionPane;

public class YearsAlive {

	public static void main(String[] args) {
		String ageStr  = JOptionPane.showInputDialog("HOw old are you?");
		int age = Integer.parseInt(ageStr);
		String yearBornStr = JOptionPane.showInputDialog("What year were you born in?");
		int yearBorn = Integer.parseInt(yearBornStr);
		for (int i = 0; i < (age + 2); i++ ) {
			System.out.println(yearBorn);
			yearBorn = yearBorn + 1;
		}
	}

}
