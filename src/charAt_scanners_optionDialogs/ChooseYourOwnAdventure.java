package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
public static void main(String[] args) {
	int task = JOptionPane.showOptionDialog(null, "Hello adventurer what do you wanna do today?", "What to do?", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Food", "Water", "Pet" }, null);
}
}
