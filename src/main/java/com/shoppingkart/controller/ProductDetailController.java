package com.shoppingkart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingkart.dto.ProductDetailDTO;
import com.shoppingkart.service.serviceimp.ProductDetailsServiceImp;

@RestController
@RequestMapping("/product")
public class ProductDetailController {
	ProductDetailsServiceImp productservice;

	@PostMapping("/addProduct")
	public ResponseEntity<ProductDetailDTO> createPerson(@RequestBody ProductDetailDTO productdto) {
		productservice = new ProductDetailsServiceImp();
		productdto = productservice.addProduct(productdto);
		return ResponseEntity.status(HttpStatus.CREATED).body(productdto);

	}
}
