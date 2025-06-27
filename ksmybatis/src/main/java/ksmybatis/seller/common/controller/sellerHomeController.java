package ksmybatis.seller.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sellerHomeController {
	
	@GetMapping(value={"/seller" , "/seller/"})
	public String sellrMainView() {
		
		return "seller/main";
	}

}
