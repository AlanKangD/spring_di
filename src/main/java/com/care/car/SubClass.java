package com.care.car;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SubClass {
	public void func() {
		//Car car = new Controller01();
		String path = "classpath:applicationCAR.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		Car car = ctx.getBean("car", Car.class);
		System.out.println("서브실행");
		car.speed();
		System.out.println();
	//	Car car01 = new Controller_v1_1();
	//	System.out.println("서브실행");
	//	car01.speed();
	}
}
