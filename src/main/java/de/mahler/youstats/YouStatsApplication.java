package de.mahler.youstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Configuration
public class YouStatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(YouStatsApplication.class, args);
	}
}
