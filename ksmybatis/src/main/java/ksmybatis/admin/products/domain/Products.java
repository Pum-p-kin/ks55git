package ksmybatis.admin.products.domain;

import lombok.Data;

@Data
public class Products {
	private String productCode;
	private String productName; 
	private String vendorCode;
	private int productUnitPrice;  // 널을 못 담기 때문에 int(X) Integer(ㅇ)
	private String productRegDate;
	
}
