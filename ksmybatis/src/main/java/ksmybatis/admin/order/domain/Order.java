package ksmybatis.admin.order.domain;

import lombok.Data;

@Data
public class Order {
	private String orderNo;
	private String customerId; 
	private String orderDate;
}
