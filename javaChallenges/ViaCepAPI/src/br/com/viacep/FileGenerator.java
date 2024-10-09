package br.com.viacep;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FileGenerator {
	public void saveJson(Address address) throws IOException {
		Gson gson = new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
				.setPrettyPrinting()
				.create();
		FileWriter writing = new FileWriter(address.cep() + ".json");
		writing.write(gson.toJson(address));
		writing.close();
	}
}
