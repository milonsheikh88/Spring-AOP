package com.milonsheikh.wildcard;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {
	
	@Before("myPointCut()")
	public void wakeup() {
		System.out.println("Good Morning...");
	}
	//Advice
	@After("myPointCut()")
	public void sleep() {
		System.out.println("Good Night...");
	}
	
	@Pointcut("execution(public * study*())") //Wildcard-Pointcut-Expression
	public void myPointCut() {
		
	}

}
