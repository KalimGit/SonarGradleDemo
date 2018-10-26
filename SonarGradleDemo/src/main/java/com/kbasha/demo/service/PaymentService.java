package com.kbasha.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kbasha.demo.model.CustomerPayment;
import com.kbasha.demo.repository.PaymentJpaRepository;

@Service
@Transactional
public class PaymentService implements PaymentInterfaceService{
	@Autowired
	PaymentJpaRepository paymtJpaRepo;	
	
	

	@Override
	public void makePayment(CustomerPayment custPay)
	{
		CustomerPayment cust = paymtJpaRepo.saveAndFlush(custPay);
		System.out.println(custPay.getCustName());
		System.out.println("Cust Id ="+ cust.getId());
	}

	@Override
	public List<CustomerPayment> getAllPayment() {
		List<CustomerPayment> custList;
		custList = paymtJpaRepo.findAll();
		return custList;
	}
	
	

}
