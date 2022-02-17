package com.milonsheikh.createAspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {
	
	@Before("execution(public void study())")
	public void wakeup() {
		System.out.println("Good Morning...");
	}
	
	@After("execution(public void study())")
	public void sleep() {
		System.out.println("Good Night...");
	}

}
