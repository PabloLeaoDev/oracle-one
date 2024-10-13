package br.com.coins.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import br.com.coins.models.Coins;

public class ExchangeRate {
							
	public Address searchAddress(Coins coin) throws IOException, InterruptedException {
		String apiKey = "6d7c9b31f615980f3fbf4ff4";
		String urlStr = String
				.format("https://v6.exchangerate-api.com/v6/%s/latest/%s",
						apiKey, coin.getBaseCode());
		
		HttpClient client = HttpClient.newHttpClient(); 
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(urlStr))
				.build();
		HttpResponse<String> response = client
				.send(request, HttpResponse.BodyHandlers.ofString());
		
		Address json = new Gson().fromJson(response.body(), Address.class);
		return json;
	}
}
