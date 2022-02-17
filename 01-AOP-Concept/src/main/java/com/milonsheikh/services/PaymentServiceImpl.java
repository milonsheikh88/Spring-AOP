package com.milonsheikh.services;

public class PaymentServiceImpl implements PaymentService {

	public void makePayment(int amount) {
		System.out.println(amount+" Amount debited.....");

		System.out.println(amount+ " Amount credited.....");
	}

}
