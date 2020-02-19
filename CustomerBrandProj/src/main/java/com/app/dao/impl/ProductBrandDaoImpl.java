package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IProductDao;
import com.app.model.ProductBrand;
@Repository
public class ProductBrandDaoImpl implements IProductDao{
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveProduct(ProductBrand productBrand) {
		// TODO Auto-generated method stub
		return (Integer) ht.save(productBrand) ;
	}

	@Override
	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		ProductBrand p=new ProductBrand();
		p.setProdId(id);
		ht.delete(p);
	}

	@Override
	public List<ProductBrand> getAllRecord() {
		// TODO Auto-generated method stub
		return ht.loadAll(ProductBrand.class);
	}

	@Override
	public void updateRecord(ProductBrand productBrand) {
		// TODO Auto-generated method stub
		ht.update(productBrand);
		
	}

}
