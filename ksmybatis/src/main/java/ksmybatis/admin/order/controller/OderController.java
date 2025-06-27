package ksmybatis.admin.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmybatis.admin.order.service.OrderService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping(value="/admin/order")
@RequiredArgsConstructor
public class OderController {

	private final OrderService orderservice;
	
	@GetMapping("/orderList")
	public String orderListView(Model model) {
		
		var orderList = orderservice.getOrderList(); 
		
		model.addAttribute("title", "주문목록조회");
		model.addAttribute("orderList", orderList);
		
		return "admin/order/orderListView";
	}
}
