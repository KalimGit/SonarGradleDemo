package com.kbasha.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kbasha.demo.model.CustomerPayment;
import com.kbasha.demo.service.PaymentService;

@Controller
public class SpringBootLoginWithDBController {
	@Autowired
	PaymentService paymtService;
	
	public void setPaymtService(PaymentService paymtService) {
		this.paymtService = paymtService;
	}

	@RequestMapping("/")	
	public String redirectToLandingPage()
	{
		return "index";
	}
	@RequestMapping("/viewHistory")
	public String redirectToViewHistory(ModelMap model)
	{
		List<CustomerPayment> custPymt = paymtService.getAllPayment();
		model.addAttribute("custPaymt",custPymt);
		return "viewHistory";
	}
	
	@RequestMapping("/viewSubmission")	
	public String submitForm(@ModelAttribute("CustomerPayment") CustomerPayment custPay, ModelMap model )
	{
		paymtService.makePayment(custPay);
		List<CustomerPayment> custSubmit = paymtService.getAllPayment();
		model.addAttribute("custSubmit", custSubmit);
		return "viewSubmission";
	}

	
	
	

}
