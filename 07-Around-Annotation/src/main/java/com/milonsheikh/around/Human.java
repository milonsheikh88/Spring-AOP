package com.milonsheikh.around;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {
	
	@Around("execution(int videoRank(int, int))")
	public Object wakeupAround(ProceedingJoinPoint pjp) {
		Object[] objArgs= pjp.getArgs();
		
		objArgs[0]=Integer.parseInt(objArgs[0]+"")-50;
		objArgs[1]=Integer.parseInt(objArgs[1]+"")-20;
		
		Object res=null;
		try {
			res=pjp.proceed(objArgs);		
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println(res);
		
		return res;
	}

}
