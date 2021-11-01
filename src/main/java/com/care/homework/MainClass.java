package com.care.homework;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "classpath:homework.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		SaveClass SC = ctx.getBean("SC", SaveClass.class);
		
		System.out.print("두수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.print("연산할 부호를 입력하세요 (+,-,*,/) : ");
		String op = sc.next();
		
		SC.setNum1(num1);
		SC.setNum2(num2);
		SC.setOp(op);
		
		SC.operationClass();
		SC.printClass();
		
		
		
		
		
		
	}

}
