package ksmybatis.seller.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/seller/product")
public class ProductController {
	
	@GetMapping("/productList")
	public String productListViewS() {
		
		return "seller/product/productListView";
	}
}
