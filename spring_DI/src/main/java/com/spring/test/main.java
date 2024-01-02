package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C c = new C();
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:com/spring/context/application.xml");
		
		C c = context.getBean("c", C.class);
		
		Z z = c.getZ();
		
		
		z.a();
	}

}
