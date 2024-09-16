package bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name = "Fulano da Silva";
		String accountType = "Current";
		double initialBalance = 2500;
		Bank bk = new Bank(initialBalance);
		Scanner sc = new Scanner(System.in);
		String initialDisplay = String.format("""
				****************************** 
				Initial client data:
				
				Name: %s
				Account type: %s
				Initial balance: R$ %.2f
				******************************
				""", name, accountType, initialBalance);
		System.out.printf("%s", initialDisplay);
		int chosenOperation;
		do {
			String initialMenu = """ 
				
				Operations
				
				1- Check balance
				2- Receive value
				3- Transfer value
				4- Exit
				
				Enter the desired option:
				""";
			System.out.printf("%s", initialMenu);
			
			chosenOperation = sc.nextInt();
			
			switch (chosenOperation) {
				case 1:
					bk.checkBalance();
					break;
				case 2:
					System.out.println("Value to receive: ");
					double valueToReceive = sc.nextDouble();
					bk.receiveValue(valueToReceive);
					break;
				case 3:
					System.out.println("Value to transfer: ");
					double valueToTransfer = sc.nextDouble();
					bk.transferValue(valueToTransfer);
					break;
				default:
					if (chosenOperation != 4)
						System.out.println("\nInvalid Operation");
					break;
			}
		} while (chosenOperation != 4);
		System.out.println("\nProgram finished");		
	}

}
