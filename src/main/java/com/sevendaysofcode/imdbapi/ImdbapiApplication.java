package com.sevendaysofcode.imdbapi;

import com.sevendaysofcode.imdbapi.Controller.ApiController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImdbapiApplication {

	public static void main(String[] args) throws Exception{

		SpringApplication.run(ImdbapiApplication.class, args);
		ApiController apiController = new ApiController();

		apiController.getTopMovies();
	}
}
