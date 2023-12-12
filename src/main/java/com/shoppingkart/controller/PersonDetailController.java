package com.shoppingkart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingkart.dto.PersonDetailDTO;
import com.shoppingkart.service.serviceimp.PersonDetailServiceImp;

@RestController
@RequestMapping("/person")
public class PersonDetailController {
	PersonDetailServiceImp personservice;

	@PostMapping("/signup")
	public ResponseEntity<PersonDetailDTO> createPerson(@RequestBody PersonDetailDTO persondto) {
		personservice=new PersonDetailServiceImp();
		persondto = personservice.createPerson(persondto);
		return ResponseEntity.status(HttpStatus.CREATED).body(persondto);

	}
}
