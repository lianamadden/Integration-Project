
public class Room2 {

	public static void room2Stuff(String doctorName, String doctorQuestion, int doctorAnswer, String chooseRight,
			String chooseWrong) {
		System.out.println(
				"\n\n------------------------------------------ \n" + "introduction");
		int saberGiveHit = 0;
		int saberTakeHit = 0;
		do {
			doctorQuestion = "\nQuestion? \n 1. Hit answer  \n 2. Take hit answer";
			chooseRight = ("------------------------------------------ \n"
					+ "good choice");
			chooseWrong = ("------------------------------------------ \n" + "bad choice");
			doctorAnswer = Main.doctorInput(doctorQuestion, doctorAnswer, chooseRight, chooseWrong);
			if (doctorAnswer == 1) {
				saberGiveHit += 2;
			}else {
				saberTakeHit += 2;
			}
		}while (saberGiveHit < 10 && saberTakeHit < 10);
	}
}
