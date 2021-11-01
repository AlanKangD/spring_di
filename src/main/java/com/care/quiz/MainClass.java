package com.care.quiz;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:application_test.xml";
		
		GenericApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		
		PrintBean pb = ctx.getBean("pb", PrintBean.class);
		
		
		pb.pS();
	}
}
