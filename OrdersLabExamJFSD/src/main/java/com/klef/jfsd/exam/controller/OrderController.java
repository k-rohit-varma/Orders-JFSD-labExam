package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Orders;
import com.klef.jfsd.exam.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService ser;
	
	@PostMapping("save")
	public Orders saveOrders(@RequestBody  Orders order)
	{
		Orders ord = new Orders();
		ord.setCustomerName(order.getCustomerName());
		ord.setOrderDate(order.getOrderDate());
		ord.setOrderId(order.getOrderId());
		ord.setProductName(order.getProductName());
		ord.setQuality(order.getQuality());
		return ser.saveOrder(ord);
	}
	
}
