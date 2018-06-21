package com.el.ally.invoicify.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class SeedData {

/*	public SeedData(ActorRepository actorRepository, MovieRepository movieRepository) {
		actorRepository.save(new Actor("firstname", "secondname", 1234, new Date()));
		movieRepository.save(new Movie("title", "2018", 12345, "distributor"));
	}*/
}