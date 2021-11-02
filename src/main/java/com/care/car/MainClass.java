package com.care.car;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.care.homework.SaveClass;

public class MainClass {
	public static void main(String[] args) {
		//Car car = new Controller01();
		String path = "classpath:applicationCAR.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		Car car = ctx.getBean("car", Car.class);
		System.out.println("메인실행");
		car.speed();
		System.out.println();
		//Car car01 = new Controller_v1_1();
//		System.out.println("메인실행");
//		car01.speed();
//		System.out.println();
		SubClass sc = new SubClass();
		sc.func();
		
		System.out.println("-----------------------");
		
		
	}
}	
