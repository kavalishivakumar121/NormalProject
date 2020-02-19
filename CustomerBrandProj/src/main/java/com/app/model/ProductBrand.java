package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="ProductTable")
public class ProductBrand {
	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer prodId;
	@Column(name="BName")
	private String brandName;
	@Column(name="category")
	private String categoryType;
	@Column(name="price")
	private Double priceValue;
	public ProductBrand(Integer prodId, String brandName, String categoryType, double priceValue) {
		super();
		this.prodId = prodId;
		this.brandName = brandName;
		this.categoryType = categoryType;
		this.priceValue = priceValue;
	}
	public ProductBrand() {
		super();
	}
	public ProductBrand(Integer prodId) {
		super();
		this.prodId = prodId;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	public Double getPriceValue() {
		return priceValue;
	}
	public void setPriceValue(Double priceValue) {
		this.priceValue = priceValue;
	}
	@Override
	public String toString() {
		return "ProductBrand [prodId=" + prodId + ", brandName=" + brandName + ", categoryType=" + categoryType
				+ ", priceValue=" + priceValue + "]";
	}
	
	
	
}
