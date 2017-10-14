package com.stackroute.Insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InsuranceSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(InsuranceSpringApplication.class, args);
        Insurance insurance = (Insurance) ctx.getBean("insurance");
        insurance.Result();
	}
}
