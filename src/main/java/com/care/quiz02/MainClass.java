package com.care.quiz02;

import java.util.Scanner;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "classpath:application_test02.xml";
		
		GenericApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		System.out.print("두수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.print("연산하고 싶은 부호를 넣으세요 (+,-,*,/) : ");
		String op = sc.next();
		
		SaveClass SC = ctx.getBean("SC",SaveClass.class);
		
		SC.setNum1(num1);
		SC.setNum2(num2);
		SC.setOp(op);
		
		SC.operationClass();
		SC.printClass(num1, op, num2);
		
		
		
		
		
		
	}

}
