package com.deepak.udm.basics.springbootws;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootWsApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringbootWsApplication.class, args);//runs a springcontext
		//Above method returns application Context
		for (String name : appContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
