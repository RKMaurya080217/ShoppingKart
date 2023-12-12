package com.shoppingkart.service.serviceimp;

import com.shoppingkart.dao.OrderCRUDDAO;
import com.shoppingkart.dto.OrderDetailDTO;
import com.shoppingkart.service.OrderDetailService;

public class OrderDetailServiceImp implements OrderDetailService {
	OrderCRUDDAO orderdao;

	public OrderDetailDTO addOrder(OrderDetailDTO orderdto) {
		orderdao = new OrderCRUDDAO();
		orderdto=orderdao.addOrder(orderdto);
		return orderdto;
	}

}
