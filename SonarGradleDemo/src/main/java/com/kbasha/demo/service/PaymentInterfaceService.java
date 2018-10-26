package com.kbasha.demo.service;

import java.util.List;

import com.kbasha.demo.model.CustomerPayment;

public interface PaymentInterfaceService{
	
	public void makePayment(CustomerPayment custPay);
	public List<CustomerPayment> getAllPayment();
}
