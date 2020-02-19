package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ICustomerDao;
import com.app.model.CustomerDetails;
import com.app.model.ProductBrand;
@Repository
public class CustomerDaoImpl implements ICustomerDao{
@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveCust(CustomerDetails customerDetails) {
		CustomerDetails d=new CustomerDetails();
		ProductBrand p=new ProductBrand();
		Double pValue=p.getPriceValue();
		Double dis=pValue*(10/100);
		d.setDiscount(dis);
		Double total=pValue-dis;
		d.setTotalAmount(total);
		// TODO Auto-generated method stub
		return (Integer)ht.save(d);
	}

	@Override
	public List<CustomerDetails> getAllCustomer() {
		// TODO Auto-generated method stub
		return ht.loadAll(CustomerDetails.class);
	}

	@Override
	public void updateCust(CustomerDetails customerDetails) {
		// TODO Auto-generated method stub
		ht.update(customerDetails);
	}

	@Override
	public void deleteCust(Integer id) {
		// TODO Auto-generated method stub
		
		CustomerDetails cus=new CustomerDetails();
		cus.setCustId(id);
		ht.delete(cus);
		
	}

	@Override
	public CustomerDetails getOneRecord(Integer id) {
		// TODO Auto-generated method stub
		return ht.get(CustomerDetails.class, id);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ProductBrand> getBrand(String brand) {
		// TODO Auto-generated method stub
		String hql="from com.app.model.ProductBrand"+" where brandName=?0";
		
		return (List<ProductBrand>) ht.find(hql, brand);
	}

}
