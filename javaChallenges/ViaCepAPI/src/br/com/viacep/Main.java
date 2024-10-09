package br.com.viacep;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the CEP to view informations:");
		var cep = sc.next();
		
		CepConsult cepConsult = new CepConsult();
		
		try {
			Address newAddress = cepConsult.searchAddress(cep);
			FileGenerator file = new FileGenerator();
			System.out.println(newAddress);	
			file.saveJson(newAddress);
		} catch (IOException | InterruptedException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Program finished");
		}
		
	}

}
