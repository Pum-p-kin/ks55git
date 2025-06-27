package ksmybatis.admin.order.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmybatis.admin.order.domain.Order;
import ksmybatis.admin.order.mapper.OrderMapper;
import ksmybatis.admin.order.service.OrderService;
import lombok.RequiredArgsConstructor;
@Service
@Transactional
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{
	
	private final OrderMapper orderMapper;
	
	@Override
	public List<Order> getOrderList() {
		List<Order> orderList = orderMapper.getOrderList();
		return orderList;
	}
}
