package com.app.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.dao.IProductDao;
import com.app.model.ProductBrand;
import com.app.service.IProductService;
@Service
public class ProductServiceImpl implements IProductService {
@Autowired
	private IProductDao dao;
@Transactional
public Integer saveProduct(ProductBrand productBrand) {
		// TODO Auto-generated method stub
		return dao.saveProduct(productBrand);
	}
	@Transactional
	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteProduct(id);
	}
@Transactional(readOnly = true)
	public List<ProductBrand> getAllRecord() {
		// TODO Auto-generated method stub
		return dao.getAllRecord();
	}
@Override
@Transactional
public void updateRecord(ProductBrand productBrand) {
	// TODO Auto-generated method stub
	dao.updateRecord(productBrand);
}

}
