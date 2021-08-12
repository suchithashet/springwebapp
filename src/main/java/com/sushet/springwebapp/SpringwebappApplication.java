package com.sushet.springwebapp;



import static org.springframework.boot.SpringApplication.run;

import Controllers.BookController;
import com.sushet.springwebapp.BootStrap.BootstrapData;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackageClasses= BookController.class)
@ComponentScan(basePackageClasses= BootstrapData.class)
public class SpringwebappApplication {

	public static void main(String[] args) {

		run(SpringwebappApplication.class, args);
	}

}
