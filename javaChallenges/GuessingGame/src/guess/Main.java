package guess;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int randomNumber = rd.nextInt(100);
		int attemptsMaxNumber = 5;
		int attemptsTotalNumber = 0;
		int playerAttempts;
		
		for (int i = 0; i < attemptsMaxNumber; i++) {
			System.out.println("Enter your attempt (0 - 100): ");
			playerAttempts = sc.nextInt();
			attemptsTotalNumber++;
			
			if (playerAttempts == randomNumber) {
				System.out.println("\nYou Win!");
				attemptsTotalNumber--;
				break;
			} else if (playerAttempts > randomNumber) {
				System.out.println("\nThe chosen number is SMALLEST.");
			} else if (playerAttempts < randomNumber) {
				System.out.println("\nThe chosen number is LARGEST.");
			}
			
			if (playerAttempts < 0 || playerAttempts > 100)
				System.out.printf("Your attempt %d is invalid.", playerAttempts);
			
			if ((attemptsMaxNumber - attemptsTotalNumber) != 0)
				System.out.printf("\nTry again, you have more %d attempts.\n\n", (attemptsMaxNumber - attemptsTotalNumber));
		}
		
		if (attemptsTotalNumber == attemptsMaxNumber) {
			System.out.println("\nYou Lose!\nGAME OVER");
			System.out.printf("\nThe chosen number was %d.", randomNumber);
		}
	}
}
