package com.sevendaysofcode.imdbapi.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class ApiController {

	@Value("${apiKey}")
	private String apiKey;

	public String getTopMovies() throws IOException, InterruptedException{

		URI apiIMDB = URI.create("https://imdb-api.com/en/API/Top250TVs/" + this.apiKey);

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(apiIMDB).build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String json = response.body();

		System.out.println(this.apiKey);

		return json;
	}
}
