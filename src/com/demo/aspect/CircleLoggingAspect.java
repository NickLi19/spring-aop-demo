package com.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(0)
public class CircleLoggingAspect {
	
	@Before("execution(public String com.demo.model.Circle.getName())")
	public void anotherAdvice() {
		System.out.println("Another Advice run. Circle getName Method");
	}

}
