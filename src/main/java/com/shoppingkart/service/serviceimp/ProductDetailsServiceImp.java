package com.shoppingkart.service.serviceimp;

import com.shoppingkart.dao.ProductCRUDDAO;
import com.shoppingkart.dto.ProductDetailDTO;
import com.shoppingkart.service.ProductDetailService;

public class ProductDetailsServiceImp implements ProductDetailService {
	ProductCRUDDAO productdao;

	public ProductDetailDTO addProduct(ProductDetailDTO productdto) {
		productdao = new ProductCRUDDAO();
		productdto = productdao.addProduct(productdto);
		return productdto;
	}

}
