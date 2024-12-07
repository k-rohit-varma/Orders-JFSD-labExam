package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Orders;
import com.klef.jfsd.exam.repo.Repository;

@Service
public class OrderService {

	@Autowired
	Repository repo;
	
	public Orders saveOrder(Orders order) {
		System.out.println(order.toString());
		return repo.save(order);
	}
}
