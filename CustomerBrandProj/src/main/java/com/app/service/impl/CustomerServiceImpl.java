package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ICustomerDao;
import com.app.model.CustomerDetails;
import com.app.model.ProductBrand;
import com.app.service.ICustomerService;
@Service
public class CustomerServiceImpl implements ICustomerService{
@Autowired
	private ICustomerDao dao;

@Override
@Transactional
public Integer saveCust(CustomerDetails customerDetails) {
	// TODO Auto-generated method stub
	return dao.saveCust(customerDetails);
}

@Override
@Transactional(readOnly = true)
public List<CustomerDetails> getAllCustomer() {
	// TODO Auto-generated method stub
	return dao.getAllCustomer();
}

@Override
@Transactional
public void updateCust(CustomerDetails customerDetails) {
	// TODO Auto-generated method stub
	dao.updateCust(customerDetails);
}

@Override
@Transactional
public void deleteCust(Integer id) {
	// TODO Auto-generated method stub
	dao.deleteCust(id);
}

@Override
@Transactional(readOnly = true)
public CustomerDetails getOneRecord(Integer id) {
	// TODO Auto-generated method stub
	return dao.getOneRecord(id);
}

@Override
@Transactional(readOnly = true)
public List<ProductBrand> getBrand(String brand) {
	// TODO Auto-generated method stub
	return dao.getBrand(brand);
}
	
	




}
