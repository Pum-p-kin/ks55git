package ksmybatis.admin.products.domain;

import lombok.Data;

@Data
public class addProduct {
	private String vendCode;
	private String prodCode;
	private String prodName;
	private String prodUnitPrice;
	private String prodRegDate;
	private String vendName;
	private String mbrName;
	
}
