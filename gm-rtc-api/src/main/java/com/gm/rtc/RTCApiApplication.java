package com.gm.rtc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RTCApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RTCApiApplication.class, args);
	}

}
