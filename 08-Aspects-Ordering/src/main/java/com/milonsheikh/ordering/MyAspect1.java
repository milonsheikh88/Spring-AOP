package com.milonsheikh.ordering;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect1 {
	
	@Before("execution(* * (..))")
	public void adviceA() {
		System.out.println("adviceA ---- MyAspect1");
	}
	
	@Before("execution(* * (..))")
	public void adviceB() {
		System.out.println("adviceB ---- MyAspect1");
	}

}
