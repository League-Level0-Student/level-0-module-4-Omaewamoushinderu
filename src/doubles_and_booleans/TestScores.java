package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("What was your test score");
	int scores = Integer.parseInt(score);
	if(scores > 50) {
		JOptionPane.showMessageDialog(null, "Good job you pass");
	}
	else {
		JOptionPane.showMessageDialog(null, "You failed");
	}
}
}
