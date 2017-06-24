package org.learnjava.dq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = "spring-applicationContext.xml")
public class UnitTestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitTestDemoApplication.class, args);
	}
}
