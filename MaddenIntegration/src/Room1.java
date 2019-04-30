// Liana Madden
import java.util.Scanner;

public class Room1 {
  public int hearts;

  public static void room1Stuff(String doctorName, String doctorQuestion, int doctorAnswer,
      String chooseRight, String chooseWrong, Scanner scanner) {
    System.out.println("\n\n------------------------------------------ \n" + "Patient Name: Link \n"
        + "Patient Age: 17 \n" + "Country of Residence: Hyrule \n"
        + "Chief Complaint: Unconscious, Wounds, Burns \n"
        + "Notes: Patient came by ambulance into the ER; unconcscious upon arrival. Wounds \n"
        + "located on all extremeties and upper torso. Pulse is slow and faint. Lungs sounds \n"
        + "are diminished. \n"
        + "\n(Upon walking into the room you see a young boy dressed in green laying in the bed.\n"
        + " A young girl with long blonde hair is accompanying him.) \n "
        + "\nZelda: Link... (turns to face you) \n"
        + "\t Please help him. He lost all of his hearts while saving my life.\n"
        + "------------------------------------------ \n");
    doctorQuestion =
        "\nWhat would you like to do? \n 1. Introduce yourself  \n 2. Start care on patient";
    chooseRight = ("------------------------------------------ \n" + "\nYou: Hello, I'm Dr. "
        + doctorName + ".\n\tI will be taking care of Link today.\n"
        + " \tHow are you related to the patient?\n"
        + "Zelda: I'm Zelda. Link and I are....... friends.\n"
        + "You: I will do whatever I can to make him well.\n");
    chooseWrong = ("------------------------------------------ \n"
        + "\nZelda: Shouldn't you introduce yourself? \n"
        + "\t(Zelda stands up and her hands begin to glow with electric sparks)\n"
        + "\t Imposter! I will not allow him to be hurt again!\n"
        + "------------------------------------------ \n");
    doctorAnswer = Main.doctorInput(doctorQuestion, doctorAnswer, chooseRight, chooseWrong);
    System.out.println(
        "Liana: It looks like he has 1 heart currently and he needs 14 hearts to become conscious again.\n"
            + "\t Let's get those hearts up!\n" + "------------------------------------------ \n");
    int hearts = 1;

    // There must be something in the loop that changes the loop condition
    while (hearts < 15) {
      doctorQuestion =
          ("\nWhat would you like to do? \n 1. Cook Meat Skewer Recipe \n 2. Consult with"
              + " evil statue in Hateno village");
      doctorAnswer = heartInput(doctorQuestion, doctorAnswer, scanner);
      if (doctorAnswer == 1) {
        System.out.println("Hearts increased: " + ++hearts);
      } else {
        System.out.println("Hearts decreased: " + --hearts);
      }
      doctorQuestion = ("\nWhat would you like to do? \n 1. Give a fairy \n 2. Smash a red pot");
      doctorAnswer = heartInput(doctorQuestion, doctorAnswer, scanner);
      if (doctorAnswer == 1) {
        hearts += 5;
        System.out.println("Hearts increased: " + hearts);
      } else {
        hearts = hearts + 2;
        System.out.println("Hearts increased: " + hearts);
      }
      doctorQuestion =
          ("\nWhat would you like to do? \n 1. Give health potion \n 2. Give Link to Moblins");
      doctorAnswer = heartInput(doctorQuestion, doctorAnswer, scanner);
      if (doctorAnswer == 1) {
        hearts *= 2;
        System.out.println("Hearts increased: " + hearts);
      } else {
        hearts /= 2;
        System.out.println("Hearts decreased: " + hearts);
      }
      doctorQuestion =
          ("\nWhat would you like to do? \n 1. Find hearts in grass \n 2. Sacrifice to Ganon"
              + " for magical powers.");
      doctorAnswer = heartInput(doctorQuestion, doctorAnswer, scanner);
      if (doctorAnswer == 1) {
        hearts = hearts + 2;
        System.out.println("Hearts increased: " + hearts);
      } else {
        hearts = hearts % 2;
        System.out.println("Hearts decreased: " + hearts);
      }
    }
    System.out.println(
        "------------------------------------------ \n" + "\n\nLink: (weakly) Princess...\n"
            + "Liana: I think he's waking up!\n" + "Zelda: Yes, Link I'm here!\n"
            + "Link: Princess... Princess... Mipha\n" + "Zelda: Princess MIPHA?!?!\n"
            + "\t I should've let Ganon kill you. (storms out of room)\n"
            + "Liana: Well, I think our job here is done. "
            + "------------------------------------------ \n");
    doctorQuestion = ("\nWhat would you like to do? \n1. Leave Room \n2. Listen to Link vent.");
    chooseRight = ("Liana: I think that's a good idea.");
    chooseWrong = ("------------------------------------------ \n"
        + "Link: She's just too needy, doctor. I ALWAYS have to rescue her.\n"
        + "\t She's the reason i'm here in the first place.\n"
        + "\t Rescuing her is my job. This one time.... (3 hours later)\n"
        + "------------------------------------------ \n");
    doctorAnswer = Main.doctorInput(doctorQuestion, doctorAnswer, chooseRight, chooseWrong);
    Main.pickNewRoom(doctorQuestion, doctorAnswer, doctorName, chooseRight, chooseWrong);
  }

  public static int heartInput(String doctorQuestion, int doctorAnswer, Scanner scanner) {

    System.out.println(doctorQuestion + "\n(Please choose a number.)");
    doctorAnswer = scanner.nextInt();
    return doctorAnswer;
  }
}
