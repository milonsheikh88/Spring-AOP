package com.milonsheikh.ordering;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCofig.class);
		Student student = context.getBean("student", Student.class);
		student.sum(45, 5);

	}
}
