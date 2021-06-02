package com.gm.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GMEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GMEurekaserverApplication.class, args);
	}

}
