package com.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class LoggingAspect {

//	@Before("execution(public String getName())")
	@Before("adviceForAllGetters()")
//	@Before("execution(public String com.demo.model.Circle.getName())")
	public void simpleAdvice() {
		System.out.println("Advice run. getNameMethod");
	}
	
	@Pointcut("execution(public * get*())")
	public void adviceForAllGetters() {
		System.out.println("Advice for All Getters.");
	}
	
	@Before("within(com.demo.model.Circle)")
	public void adviceForAllCircleMethods(JoinPoint joinPoint) {
		System.out.println("Advice for Circle methods using WITHIN!");
		System.out.println(joinPoint.getTarget());
	}
	
//	@Before("args(name)")
	@After("args(name)")
	public void adviceForArgs(String name) {
		System.out.println("Advice for String ARG method! " + name);
	}
	
	@AfterReturning(pointcut="args(temp)", returning="obj")
	public void adviceForReturning(String temp, String obj) {
		System.out.println("After returning ARG: " + temp);
		System.out.println("After returning RETURN VAL: " + obj);
	}
	
	@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void adviceForException(String name, RuntimeException ex) {
		System.out.println("There is an EXC: " + ex);
	}
	
	@Around("args(name)")
	public Object adviceForAround(ProceedingJoinPoint proceedingJoinPoint, String name) {
		Object obj = null;
		try {
			System.out.println("Before advice.");
			obj = proceedingJoinPoint.proceed();
			System.out.println("After Returning: " + name);
		} catch(Throwable e) {
			System.out.println("After throwing." + e);
		}
		
		return obj;
	}
}
