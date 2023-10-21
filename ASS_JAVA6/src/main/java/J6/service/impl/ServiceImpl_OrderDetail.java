package J6.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import J6.dao.DAO_OrderDetail;
import J6.service.Service_OrderDetail;
import J6.util.XDate;

@Service
public class ServiceImpl_OrderDetail implements Service_OrderDetail{

	@Autowired private DAO_OrderDetail daoDetail;
	@Autowired private XDate xdate;
	
	@Override
	public Double getTodayIncome() {
		return daoDetail.findAll().stream().filter(e->e.getOrder().getCreateDate().toString().equals(xdate.convertToPattern(new Date(), "yyyy-MM-dd"))).mapToDouble(item->item.getPrice()*item.getQuantity()).sum();
	}
	@Override
	public Double getTotalIncome() {
		return daoDetail.findAll().stream().mapToDouble(item->item.getPrice()*item.getQuantity()).sum();
	}

}
