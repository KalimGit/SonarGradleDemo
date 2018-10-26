package com.kbasha.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kbasha.demo.model.CustomerPayment;

public interface PaymentJpaRepository extends JpaRepository<CustomerPayment, Long>{

}
