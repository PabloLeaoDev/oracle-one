package br.com.purchases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static List<Map.Entry<String, Double>> purchaseList = new ArrayList<>();
	private static Map<String, Double> purchase;

	public static void main(String[] args) {
		System.out.println("Enter the card limit:");
		double cardLimit = sc.nextDouble();
		shop(cardLimit);
		
	}
	
	public static Map<String, Double> initialDisplay() {
		System.out.println("Enter purchase description:");
		String product = sc.next();
		System.out.println("Enter purchase value:");
		double productValue = sc.nextDouble();
		
		Map<String, Double> hashMap = new HashMap<String, Double>();
		hashMap.put(product, productValue);
		
		return hashMap;
	}
	
	public static void shop(double cardLimit) {
		int toContinue;
		boolean flag;
		double value = 0;
		do {			
			purchase = initialDisplay();
			for (String key : purchase.keySet()) {
				value = purchase.get(key);
			}
			if (value <= cardLimit) {
				purchaseList.addAll(purchase.entrySet());
				cardLimit -= value;
				System.out.println("Purchase made!");
			} else {
				System.out.println("Insufficient balance!");
				printPurchasesMade(cardLimit);
				return;
			}
			do {
				System.out.println("Enter 0 to leave or 1 to continue.");
				toContinue = sc.nextInt();
				flag = toContinue > 1 || toContinue < 0;
				if (flag) {
					System.out.println("Invalid value. Try again.");
				}				
			} while (flag);
		} while (toContinue != 0);
		printPurchasesMade(cardLimit);
	}
	
	public static void printPurchasesMade(double cardLimit) {
		String purchasesMade = """
				
				*********************
				PURCHASES MADE:
				""";
		System.out.println(purchasesMade);
		purchaseList.sort((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));
		for (Map.Entry<String, Double> entries : purchaseList) {
			System.out.printf("%s - %.1f\n", entries.getKey(), entries.getValue());
		}
		System.out.println("*********************");
		System.out.printf("\nCard balance: %.1f\n", cardLimit);
	}
}
