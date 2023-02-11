package ru.react.fastpipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FastPipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastPipeApplication.class, args);
		System.out.println("App started ok! Use http://localhost:8080/api/v1/user");
	}


}
