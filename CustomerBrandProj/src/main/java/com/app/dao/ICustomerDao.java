package com.app.dao;

import java.util.List;

import com.app.model.CustomerDetails;
import com.app.model.ProductBrand;

public interface ICustomerDao {
	
	public Integer saveCust(CustomerDetails customerDetails);
	public List<CustomerDetails> getAllCustomer();
	public void updateCust(CustomerDetails customerDetails);
	public void deleteCust(Integer id);
	public CustomerDetails getOneRecord(Integer id);
	public List<ProductBrand> getBrand(String brand);
}
