package com.shoppingkart.service;

import java.util.List;

import com.shoppingkart.dto.PersonDetailDTO;

public interface PersonDetailService {
	public PersonDetailDTO createPerson(PersonDetailDTO persondto);
	
	public List<PersonDetailDTO> viewAllPerson() throws Exception;
	public PersonDetailDTO updatePersonDetails(String username, PersonDetailDTO persondto);
	public boolean deletePerson(String username);

}
