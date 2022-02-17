package com.milonsheikh.wildcard;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCofig.class);

		Student student = context.getBean("student", Student.class);
		//Joinpoint 
		student.studyAnything();
		
		Employee emp = context.getBean("employee", Employee.class);
		//Joinpoint 
		emp.studySomething();

	}
}
