package com.milonsheikh.afterReturning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCofig.class);

		Student student = context.getBean("student", Student.class);
	    int val=student.studyAnything(30,40);
	    System.out.println("Return value: "+val);
			
		
		//Employee emp = context.getBean("employee", Employee.class);
		//Joinpoint 
		//emp.studySomething();

	}
}
