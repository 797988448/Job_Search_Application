package com.geekster.job_search_portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.geekster.job_search_portal")
public class JobSearchPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobSearchPortalApplication.class, args);
	}

}
