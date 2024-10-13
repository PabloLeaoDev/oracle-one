package br.com.coins;

import java.io.IOException;
import java.util.Scanner;

import br.com.coins.api.Address;
import br.com.coins.api.ExchangeRate;
import br.com.coins.api.Rates;
import br.com.coins.models.Coins;
import br.com.coins.models.Dolar;
import br.com.coins.models.Euro;
import br.com.coins.models.Real;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int times = 0;
	
	public static void main(String[] args) {
		try {
			boolean flag = true;
			while (flag) {
				int choice = 0;
				do {
					choice = initialMenu();
				} while (choice < 1 || choice > 7);
				
				Coins coin = null;
				Coins coin1 = null;
				
				switch (choice) {
				case 1:
				case 2:
					coin = new Dolar("USD");
					if (choice == 1) {
						coin1 = new Euro("EUR");
					} else {
						coin1 = new Real("BRL");
					}
					break;
				case 3:
				case 4:
					coin = new Euro("EUR");
					if (choice == 3) {
						coin1 = new Dolar("USD");
					} else {
						coin1 = new Real("BRL");
					}
					break;
				case 5:
				case 6:
					coin = new Real("BRL");
					if (choice == 5) {
						coin1 = new Dolar("USD");
					} else {
						coin1 = new Euro("EUR");
					}
					break;
				default:
					flag = !flag;
					continue;
				}
				
				ExchangeRate coinConsult = new ExchangeRate();
				Address newAddress = coinConsult.searchAddress(coin);
				Rates conversionRates = newAddress.conversion_rates();
				double conversionRatesToDouble = 0;
				
				if (coin1.getBaseCode().equalsIgnoreCase("USD")) {
					conversionRatesToDouble = Double.valueOf(conversionRates.USD());
				} else if (coin1.getBaseCode().equalsIgnoreCase("EUR")) {
					conversionRatesToDouble = Double.valueOf(conversionRates.EUR());
				} else if (coin1.getBaseCode().equalsIgnoreCase("BRL")) {
					conversionRatesToDouble = Double.valueOf(conversionRates.BRL());
				}
				
				System.out.print("\nEnter a value for conversion: ");
				
				var valueForConversion = sc.nextDouble();
				double convertedValue = convertCoin(valueForConversion, conversionRatesToDouble);
				
				System.out.printf("\nThe value %.2f [%s] corresponds to the final value --->>"
						+ " %.2f [%s]\n\n", 
						valueForConversion, coin.getBaseCode(),
						convertedValue, coin1.getBaseCode());
			}
		} catch (IOException | InterruptedException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("\nProgram finished");
		}
	}
	
	public static int initialMenu() {
		if (times == 0) {
			System.out.println("Welcome to the Coins Converter =]");
		}
		
		times++;
		
		System.out.println("""
				***********************************************
				1) Dolar ->> Euro
				2) Dolar ->> Real
				3) Euro ->> Dolar
				4) Euro ->> Real
				5) Real ->> Dolar
				6) Real ->> Euro
				7) Exit
				""");
		System.out.print("\nPlease, choose a valid option: ");
		var choice = sc.nextInt();
		if (choice < 1 || choice > 7) {
			System.out.println("\nEnter a valid option. Try again.\n");			
		} else {
			System.out.println("***********************************************");			
		}
		return choice;
	}
	
	public static double convertCoin(double value, double coinValue) {
		return value * coinValue;
	}

}
