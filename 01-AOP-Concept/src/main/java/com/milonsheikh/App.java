package com.milonsheikh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.milonsheikh.services.PaymentService;

public class App {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/milonsheikh/beans.xml");
        PaymentService paymentObject = context.getBean("payment",PaymentService.class);
        
        //print payment starting
        paymentObject.makePayment(120);
       //print payment success

	}

}
