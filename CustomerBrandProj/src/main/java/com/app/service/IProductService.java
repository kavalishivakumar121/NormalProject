package com.app.service;

import java.util.List;

import com.app.model.ProductBrand;

public interface IProductService{

	public Integer saveProduct(ProductBrand productBrand);
	public void deleteProduct(Integer id);
	public List<ProductBrand> getAllRecord();
	public void updateRecord(ProductBrand productBrand);
}
