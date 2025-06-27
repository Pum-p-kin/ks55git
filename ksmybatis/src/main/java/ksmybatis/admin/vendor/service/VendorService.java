package ksmybatis.admin.vendor.service;

import java.util.List;

import ksmybatis.admin.vendor.domain.Vendor;

public interface VendorService {
	
	// 판매자목록 조회
	List<Vendor> getVendorList();

}
