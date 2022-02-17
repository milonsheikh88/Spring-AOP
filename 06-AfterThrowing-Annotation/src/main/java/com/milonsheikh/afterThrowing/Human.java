package com.milonsheikh.afterThrowing;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {
	
	@AfterThrowing(pointcut = "execution(public * doOperation())", throwing="ex")
	public void wakeupThrowing(MyExeption ex) {
		System.out.println("This is throwing exception = "+ex);
	}

}
