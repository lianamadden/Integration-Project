import java.util.Scanner;

// inheritance is when a subclass will take all of the features of the parent class and then add more onto it that is not part
//of the parent class
public class Room2 {
	private int dragonGlass = 0;
	private String character = "Daenerys Targaryen";

	public static void room2Stuff(String doctorName, String doctorQuestion, int doctorAnswer, String chooseRight,
			String chooseWrong, Scanner scanner) {
		System.out.println("\n\n------------------------------------------ \n" + "Patient Name: Jon Snow \n"
				+ "Patient Age: 24  \n" + "Region of Residence: Winterfell \n"
				+ "Chief Complaint: Unconscious, Stab wounds in chest, Bleeding profusely \n"
				+ "Notes: Patient came by ambulance into the ER; unconcscious upon arrival. Stab wounds \n"
				+ "located on upper torso. Pulse is flat. Patient isn't breathing.\n"
				+ "\n\n------------------------------------------ \n"
				+ "We're going to play a series of games to determine if you save Jon Snow's life or if he dies");

		String[] characterArray = { "Viserys Targaryen", "Robert Baratheon", "Eddard Stark", "Khal Drogo" };
		System.out.println(
				"What was the name of Daenerys's brother that dies from a golden crown?\n(First and Last Name)\n");
		String answer1 = scanner.nextLine();
		System.out.println(characterArray[0]);

	}

	public void overload1(int dragonGlass, String character) {
		System.out.println("This is an overloaded method with 2 parameters.");
	}

	public void overload1(int dragonGlass) {
		System.out.println("This is an overloaded method with 1 parameter.");
	}
}
