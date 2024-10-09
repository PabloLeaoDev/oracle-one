package br.com.viacep;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class CepConsult {
	
	public Address searchAddress(String cep) throws IOException, InterruptedException {
		String url = String.format("http://viacep.com.br/ws/%s/json/", cep);
		
		HttpClient client = HttpClient.newHttpClient(); 
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.build();
		HttpResponse<String> response = client
				.send(request, HttpResponse.BodyHandlers.ofString());
		
		Address json = new Gson().fromJson(response.body(), Address.class);
		return json;
	}
	
}
