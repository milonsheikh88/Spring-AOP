package com.milonsheikh.joinPoint;
import org.aspectj.lang.JoinPoint;
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
	public void wakeup(JoinPoint jp) {
		System.out.println("Good Morning...");
		
		System.out.println("JoinPoint===>>> "+jp.getArgs()[0]);
		System.out.println("JoinPoint===>>> "+jp.getSignature());
		System.out.println("JoinPoint===>>> "+jp.getSignature().getName());
		System.out.println("JoinPoint===>>> "+jp.getTarget().getClass().getName());
		System.out.println("JoinPoint===>>> "+jp.getThis().getClass().getName());
		
	}
	//Advice
	@After("myPointCut()")
	public void sleep() {
		System.out.println("Good Night...");
	}
	
	@Pointcut("execution(public * study*(..))") //Wildcard-Pointcut-Expression
	public void myPointCut() {
		
	}

}
