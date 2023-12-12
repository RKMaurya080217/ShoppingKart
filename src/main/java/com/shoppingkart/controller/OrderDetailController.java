package com.shoppingkart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingkart.dto.OrderDetailDTO;
import com.shoppingkart.service.serviceimp.OrderDetailServiceImp;

@RestController
@RequestMapping("/order")
public class OrderDetailController {
	OrderDetailServiceImp orderservice;

	@PostMapping("/addOrder")
	public ResponseEntity<OrderDetailDTO> addOrder(@RequestBody OrderDetailDTO orderdto) {
		orderservice = new OrderDetailServiceImp();
		orderdto = orderservice.addOrder(orderdto);
		return ResponseEntity.status(HttpStatus.CREATED).body(orderdto);

	}

}
