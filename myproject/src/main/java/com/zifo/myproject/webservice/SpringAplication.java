package com.zifo.myproject.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringAplication {

	public static void main(String[] args) {

		  SpringApplication.run(SpringAplication.class, args);

	}

}
