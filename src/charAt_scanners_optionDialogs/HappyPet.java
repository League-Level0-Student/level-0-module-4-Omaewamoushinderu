package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String pet; 
	static String feed; 
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
pet = JOptionPane.showInputDialog("What pet do you want to get");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for(int i=0 ; i<6 ; i++) {
	if(happinessLevel==6) {
		JOptionPane.showMessageDialog( null, "your pet is happy");
		break;
	}			
	int task = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy today?", "What to do?", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Food", "Water", "Pet" }, null);
			
if (task == 2) {
	pet();

}
else if(task == 0) {
	feed();
}
else if(task == 1) {
water();
}
}

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that they love their pet and use break; to exit for loop.

	}
	static void pet() {
		JOptionPane.showMessageDialog(null, pet + " became happier (pet happiness +2");	
	happinessLevel+=2;
	}
	static void feed() {
		JOptionPane.showMessageDialog(null, pet + " is full (pet happiness +1)");
		happinessLevel+=1;
	}
	static void water() {
		JOptionPane.showMessageDialog(null, pet + " isnt thirsty (pet happiness +1)");
		happinessLevel+=1;

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
}
