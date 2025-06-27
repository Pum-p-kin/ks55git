package ksmybatis.admin.order.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmybatis.admin.order.domain.Order;

@Mapper
public interface OrderMapper {
	List<Order> getOrderList();
}
