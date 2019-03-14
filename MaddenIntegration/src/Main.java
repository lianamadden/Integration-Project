
// Liana Madden
// Doctor decision making in the ER.

import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

// ctrl shift f to format this code  
/*
 * 1. byte- Useful for saving memory in arrays Can be used in place of int. 
 * 2. short- Can be used to save things into large arrays 
 * 3. int- A whole number. 
 * 4. long- Use when you need a range larger than int. Contains classes to support math functions
 * 5. float- Use (instead of double) for storing memory in large arrays Do NOT use for specifics like currency 
 * 6. double- Use for decimal values Do NOT use for precise things like currency 
 * 7. boolean- true or false 
 * 8. char- single character.
 * 
 * Variable- is a place holder that is waiting to be assigned 
 * Scope- is when a variable is only acceptable in the method that it was declared.
 * 
 * Object precedence- order of operations
 */
public class Main {

	// this is a header
	// public is an access modifier
	// void is the return type, meaning this method doesn't return anything
	// methods should be lowerCamelCase and be named with a verb

	public static void main(String[] args) {

		System.out.println("Welcome to my Integration Project!");
		System.out.println("In this program you will be playing the role of a doctor in the"
				+ " Emergency Room. \nPatients will come in with different illnesses, disesases, and"
				+ " injuries.\nYour decison making skills will either save the day or result in an untimely"
				+ " death. \nChoose wisely; the lives of your patients are in your hands! \n \n"
				+ "Liana: Let's make this official and give you a name. What should I call you?" + " Last name preferred.");

		Scanner scanner = new Scanner(System.in);
		String doctorName = scanner.nextLine();

		System.out.println("\nLiana: Hello Dr. " + doctorName + ", my name is Liana and I will be your nurse today.\n"
				+ "\tWe're going to be spending a lot of time together so tell me a little about yourself.\n"
				+ "\tHow old are you?");
		
 		// An integer is a number without a decimal
		int userAge = scanner.nextInt();

		if (userAge <= 21) {
			System.out.println("Liana: Wow! You're so young! I wish I was " + userAge + " again. You must be a genius!");
		} else if (userAge <= 55) {
			System.out.println("Liana: Ah, what a good age. These are the best years! \n \tYou probably"
					+ " know your way around by now but I'm here to help in whatever way i can!");
		} else if (userAge <= 75) {
			System.out
					.println("Liana: You must be really wise at this age. I can probably learn" + " a thing or two from you.");
		} else {
			System.out.println("Liana: What are you still doing here? Go retire and enjoy life, you workaholic!");
		}

		System.out.println("\tI bet you can't guess how old I am...");
		// A final variable is variable that cannot be changed and is therefore is a
		// constant
		final int NURSEAGE = 26;
		int guessNurseAge = scanner.nextInt();

		// A boolean data type holds true or false.xx
		boolean ageGuess1 = true;
		boolean ageGuess2 = false;
		if (NURSEAGE == guessNurseAge) {
			System.out.println(ageGuess1 + "! Wow, I'm surpised you got that.");
		} else {
			// double is a primitive data type that can hold decimal places
			double ageFun = Math.random();
			ageFun = ageFun * 100 + 100;
			// Casting is when you change one data type to another.
			int ageFunInt = (int) ageFun;
			System.out.println("Liana: Very close... I'm " + ageFunInt + " years old!");
		}

		System.out.println(
				"\tOkay, that's enough small talk. There are some strange things going on in this Emergency Room"
						+ " tonight. \n \tI think we better get to work. There are 5 patients that we will be taking care"
						+ " of."); 
		String doctorQuestion = ("");
		int doctorAnswer = 0;
		String chooseYes = "";
		String chooseNo = "";
		pickNewRoom(doctorQuestion, doctorAnswer, doctorName, chooseYes, chooseNo);
	}

	public static void pickNewRoom(String doctorQuestion, int doctorAnswer, String doctorName, String chooseYes, String chooseNo) {
		System.out.println("\nWhat room would you like to head to?"
				+ "\n(Enter a room number 1-5. Enter 6 if you wish to exit the program.)");
		Scanner scanner = new Scanner(System.in);
		int roomChoice = scanner.nextInt();
		switch (roomChoice) {
		case 1:
			Room1 callRoom1 = new Room1();
			Room1.room1Stuff(doctorName, doctorQuestion, doctorAnswer, chooseYes, chooseNo);
			// Room1.room1Stuff is the method
			// The variables that are in the () are the arguments that are being passed to the method.
			break;
		case 2:
			Room2 callRoom2 = new Room2();
			Room2.room2Stuff(doctorName, doctorQuestion, doctorAnswer, chooseYes, chooseNo);
			break;
		case 3:
			System.out.println("Follow me.");
			break;
		case 4:
			System.out.println("This brings you to room stuff.");
			break;
		case 5:
			System.out.println("The room is just around the corner. Follow me.");
			break;
		case 6:
			System.out.println("Thank you for trying out my program! I hope you enjoyed yourself!");
			System.exit(0);
		default:
			System.out.println("I'm sorry, another doctor is covering that room.");

		}

	}

	public static int doctorInput(String doctorQuestion, int doctorAnswer, String chooseYes, String chooseNo) {
		// public static int doctorInput is the header 
		// this includes the parameters that are in the ()
		Scanner scanner = new Scanner(System.in);
		System.out.println(doctorQuestion + "\n(Please choose a number.)");
		doctorAnswer = scanner.nextInt();
		doctorAnswer = inputReturn(doctorQuestion, doctorAnswer, chooseYes, chooseNo);
		return doctorAnswer;

	}
	public static int inputReturn(String doctorQuestion, int doctorAnswer, String chooseRight, String chooseWrong) {
		if (doctorAnswer == 1) {
			System.out.println(chooseRight);
		}else {
			System.out.println(chooseWrong);
			doctorAnswer = Main.doctorInput(doctorQuestion, doctorAnswer, chooseRight, chooseWrong);
		}
		return doctorAnswer;
		
	}
}