package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String happy  = JOptionPane.showInputDialog("Are you Happy?(yes/no)");
		if (happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
		}
		else {
			String want = JOptionPane.showInputDialog("Do you want to be happy?(yes/no)");
			if (want.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			else {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
			}
		}
	}

}
