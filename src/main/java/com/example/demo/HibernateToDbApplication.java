package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.CustomerBo;
import com.example.demo.service.CustomerService;


@SpringBootApplication
public class HibernateToDbApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=
				SpringApplication.run(HibernateToDbApplication.class, args);
		CustomerService customerService =context.getBean(CustomerService.class);
		
		CustomerBo bo1=new CustomerBo();
		bo1.setId(123);
		bo1.setName("john");
		bo1.setAddress("12341243");
		customerService.add(bo1);
		
		CustomerBo bo2=customerService.get(123);
		System.out.println(bo2);
	}

}
