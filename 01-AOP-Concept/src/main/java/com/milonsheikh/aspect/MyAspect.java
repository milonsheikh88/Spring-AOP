package com.milonsheikh.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.milonsheikh.services.PaymentServiceImpl.makePayment(..))")
	public void printBefore() {
		System.out.println("Payment started...");
		
	}
	
	@After("execution(* com.milonsheikh.services.PaymentServiceImpl.makePayment(..))")
	public void printAfter() {
		System.out.println("Payment success...");
		
	}

}
