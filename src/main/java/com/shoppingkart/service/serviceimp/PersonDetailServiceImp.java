package com.shoppingkart.service.serviceimp;

import java.util.ArrayList;
import java.util.List;

import com.shoppingkart.dao.PersonCRUDDAO;
import com.shoppingkart.dto.PersonDetailDTO;
import com.shoppingkart.service.PersonDetailService;

public class PersonDetailServiceImp implements PersonDetailService {
	PersonCRUDDAO personcruddao;
	List<PersonDetailDTO> list;

	@Override
	public PersonDetailDTO createPerson(PersonDetailDTO persondto) {
		personcruddao = new PersonCRUDDAO();
		persondto = personcruddao.addPerson(persondto);
		return persondto;
	}

	@Override
	public List<PersonDetailDTO> viewAllPerson() {
		personcruddao = new PersonCRUDDAO();
		list = new ArrayList<>();
		list = personcruddao.getAllTasks();
		return list;
	}

	@Override
	public PersonDetailDTO updatePersonDetails(String username, PersonDetailDTO persondto) {
		personcruddao = new PersonCRUDDAO();
		persondto = personcruddao.updatePerson(username, persondto);
		return persondto;
	}

}
