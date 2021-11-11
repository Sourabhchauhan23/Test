package com.chauhan.sbet.bootingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Configuration(proxyBeanMethods = false)
@Profile("dev")
public class BootingWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootingWebApplication.class, args);
	}

}
