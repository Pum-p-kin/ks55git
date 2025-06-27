package ksmybatis.admin.products.service;

import java.util.List;

import ksmybatis.admin.products.domain.Products;

public interface addProductService {

	// 상품 등록
	void addProduct(Products products);
	
	// 상품 목록 조회
	List<Products> getProdeuctList();
}
