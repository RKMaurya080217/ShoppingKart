package com.shoppingkart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		personservice = new PersonDetailServiceImp();
		persondto = personservice.createPerson(persondto);
		return ResponseEntity.status(HttpStatus.CREATED).body(persondto);

	}

	@CrossOrigin
	@GetMapping("/getallperson")
	public ResponseEntity<List<PersonDetailDTO>> getAllPerson() {
		personservice = new PersonDetailServiceImp();
		try {
			List<PersonDetailDTO> persondto = new ArrayList<PersonDetailDTO>();
			persondto = personservice.viewAllPerson();
			return ResponseEntity.ok(persondto);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PutMapping("/updateperson/{username}")
	public ResponseEntity<PersonDetailDTO> updatePerson(@PathVariable String username, @RequestBody PersonDetailDTO persondto) {
		personservice = new PersonDetailServiceImp();
		PersonDetailDTO updatedperson = personservice.updatePersonDetails(username, persondto);
		if (updatedperson != null) {
			return ResponseEntity.ok(updatedperson);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
