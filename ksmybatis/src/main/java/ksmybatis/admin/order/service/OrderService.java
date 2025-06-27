package ksmybatis.admin.order.service;

import java.util.List;

import ksmybatis.admin.order.domain.Order;

public interface OrderService {
	
	List<Order> getOrderList();

}
