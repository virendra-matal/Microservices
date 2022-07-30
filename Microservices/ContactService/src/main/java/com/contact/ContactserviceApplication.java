package com.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
//@EnableHystrix
@EnableEurekaClient
public class ContactserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactserviceApplication.class, args);
	}

}
