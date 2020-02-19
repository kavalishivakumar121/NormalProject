package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="customer_tab")
public class CustomerDetails {
@Id
@Column(name="Id")
	private Integer custId;
@Column(name="Name")
	private String custName;
@Column(name="Address")
	private String custAddress;
@Column(name="Phone")
	private Long custPhone;
	@ManyToOne
	@JoinColumn(name = "brandIdFK")
	private ProductBrand brand;
	private String cashType;
	private Double discount;
	private Double totalAmount;
	public CustomerDetails() {
		super();
	}
	public CustomerDetails(Integer custId) {
		super();
		this.custId = custId;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public Long getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(Long custPhone) {
		this.custPhone = custPhone;
	}
	public ProductBrand getBrand() {
		return brand;
	}
	public void setBrand(ProductBrand brand) {
		this.brand = brand;
	}
	public String getCashType() {
		return cashType;
	}
	public void setCashType(String cashType) {
		this.cashType = cashType;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "CustomerDetails [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress
				+ ", custPhone=" + custPhone + ", brand=" + brand + ", cashType=" + cashType + ", discount=" + discount
				+ ", totalAmount=" + totalAmount + "]";
	}
	
	
}
