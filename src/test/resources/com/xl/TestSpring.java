package com.xl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xl.aop.HelloWorld;
import com.xl.cfg.ApplicationCfg;

public class TestSpring {

	private static ApplicationContext ctx;

	public static void main(String[] args) {

		ctx = new AnnotationConfigApplicationContext(ApplicationCfg.class);
		HelloWorld hw1 = (HelloWorld) ctx.getBean("helloWorldImpl1");
		hw1.printHelloWorld();
		System.out.println();
		hw1.doPrint();
		System.out.println();
		hw1.doScan();
	}

}
