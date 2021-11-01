package com.care.root02;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	/*Student st01 = new Student();
		STBean stb = new STBean();
		stb.setSt(st01);
	*/
		
		String path = "classpath:applicationST.xml";
		//classpath : src/main/resources를 의미합니다
		GenericApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		//위의 코드는 연결시켜주어라 라는 의미의 코드입니다. 
		
		STBean stb = ctx.getBean("stb", STBean.class);
				
		
		/*stb.setName("홍길동");
		stb.setAge(20);
		*/
		stb.nP(); stb.aP();
	
	}
}
