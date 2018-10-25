import javax.swing.JOptionPane;

public class OwnAdventures {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello Adcenture!");
		int task = JOptionPane.showOptionDialog(null, "What should we do today", "What to do?", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Fight the mythical beast CATDOG", "Learn how Catdog poops.", "Journey into the jungle THE MIGHTY JUNGLE" }, null);
	
	}
}
