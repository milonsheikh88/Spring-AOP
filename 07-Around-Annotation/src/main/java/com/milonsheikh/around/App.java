package com.milonsheikh.around;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCofig.class);

		Student student = context.getBean("student", Student.class);
//	    int val=student.studyAnything(30,40);
//	    System.out.println("Return value: "+val);
//	    student.doOperation();
		
	   int rank=student.videoRank(100, 65);
	   System.out.println("Video Rank position : "+rank);
		
		//Employee emp = context.getBean("employee", Employee.class);
		//Joinpoint 
		//emp.studySomething();

	}
}
