package com.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.app.model.CustomerDetails;
import com.app.service.ICustomerService;

import CommonsUtil.CustomerUtil;
@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private ICustomerService service;
	@Autowired
	private CustomerUtil util;
	@RequestMapping("/reg")
	public String custReg(ModelMap map)
	{
		map.addAttribute("customerDetails",new CustomerDetails());
		util.addUiComponent(map);
		return "CustomerRegistration";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveCust(ModelMap map,@ModelAttribute CustomerDetails customerDetails)
	{
	Integer id=service.saveCust(customerDetails);
	String mes="Customer Record saved with :"+id;
	map.addAttribute("message",mes);
	map.addAttribute("customerDetails",new CustomerDetails());
		return "CustomerRegistration";
	}
	@RequestMapping("all")
	public String getAll(ModelMap map)
	{
		List<CustomerDetails> list=service.getAllCustomer();
		map.addAttribute("obj",list);
		map.addAttribute("customerDetails",new CustomerDetails());
		return "CustomerData";
	}
}
