package com.xl.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeHandler {

	@Before("execution(* com.xl.aop.impl.HelloWorldImpl1.*(..))")
	public void printTime() {
		System.out.println("CurrentTime = " + System.currentTimeMillis());
	}

}
