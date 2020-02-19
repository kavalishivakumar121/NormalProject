package com.app.dao;

import java.util.List;

import com.app.model.ProductBrand;

public interface IProductDao {
	
	public Integer saveProduct(ProductBrand productBrand);
	public void deleteProduct(Integer id);
	public List<ProductBrand> getAllRecord();
	public void updateRecord(ProductBrand productBrand);

}
