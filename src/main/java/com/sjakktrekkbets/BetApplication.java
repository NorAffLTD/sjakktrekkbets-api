package com.sjakktrekkbets;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BetApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetApplication.class, args);
	}
	
	@PostConstruct
	void started() {
	    TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

}
