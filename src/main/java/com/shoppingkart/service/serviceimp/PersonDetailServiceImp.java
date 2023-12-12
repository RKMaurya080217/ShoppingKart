package com.shoppingkart.service.serviceimp;

import com.shoppingkart.dao.PersonCRUDDAO;
import com.shoppingkart.dto.PersonDetailDTO;
import com.shoppingkart.service.PersonDetailService;

public class PersonDetailServiceImp implements PersonDetailService {
	PersonCRUDDAO persondao;

	public PersonDetailDTO createPerson(PersonDetailDTO persondto) {
		persondao = new PersonCRUDDAO();
		persondto = persondao.addPerson(persondto);
		return persondto;
	}

}
