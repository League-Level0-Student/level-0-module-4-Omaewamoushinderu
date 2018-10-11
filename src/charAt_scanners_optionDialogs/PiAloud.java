package charAt_scanners_optionDialogs;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.io.IOException;
import java.util.Scanner;

public class PiAloud {

	// 1. Make a main method and make sure your program can run
public static void main(String[] args) {
String Pi = ( "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566");	 
System.out.println(Pi);
Pi.charAt(0);
Pi.charAt(1);
for(int i=0 ; i<Pi.length() ; i++){
	System.out.print(Pi.charAt(i));
	speak(Pi.charAt(i));
}
}
	// 2. Make a String variable to hold the value of Pi. You could use http://www.piday.org/million/ for the value.

	// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
	// 4. Print ALL the digits of of Pi (hint: use a loop)

	// 5. Use the speak() method to speak all the digits of Pi.

	// [ADVANCED]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" to System.err.println

	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


