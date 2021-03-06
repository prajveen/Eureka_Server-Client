package com.deleteEmployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Delete_EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Delete_EmployeeApplication.class, args);
	}

}
