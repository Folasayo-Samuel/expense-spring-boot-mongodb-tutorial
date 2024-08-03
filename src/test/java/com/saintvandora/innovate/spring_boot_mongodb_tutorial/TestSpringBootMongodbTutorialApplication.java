package com.saintvandora.innovate.spring_boot_mongodb_tutorial;

import org.springframework.boot.SpringApplication;

public class TestSpringBootMongodbTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootMongodbTutorialApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
