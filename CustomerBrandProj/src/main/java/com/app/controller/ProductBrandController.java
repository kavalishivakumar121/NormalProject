package com.app.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.ProductBrand;
import com.app.service.IProductService;
@Controller
@RequestMapping("/product")
public class ProductBrandController {

	@Autowired
	private IProductService service;
@RequestMapping("/reg")
public String regProduct(ModelMap map)
{
	map.addAttribute("productBrand",new ProductBrand());
	return "ProductRegistration";
	}
@RequestMapping(value = "/save",method = RequestMethod.POST)
public String saveProduct(ModelMap map,@ModelAttribute ProductBrand productBrand)
{
	Integer id=service.saveProduct(productBrand);
	String msg="Product Record Saved with :"+id;
	map.addAttribute("message",msg);
	map.addAttribute("productBrand",new ProductBrand());
	return "ProductRegistration";
}
@RequestMapping("/all")
public String getAllProduct(ModelMap map)
{
	List<ProductBrand> lis=service.getAllRecord();
	map.addAttribute("list",lis);
	return "AllRecords";
	}
@RequestMapping("/delete")
public String deleteRecord(ModelMap map,@RequestParam Integer id)
{
	service.deleteProduct(id);
	List<ProductBrand> lis=service.getAllRecord();
	map.addAttribute("list",lis);
	return "AllRecords";
	}
@RequestMapping(value = "/update",method =RequestMethod.POST)
public String updateRecord(ModelMap map,@ModelAttribute ProductBrand productBrand)
{
	service.updateRecord(productBrand);
	map.addAttribute("update","Record updated successfull");
	List<ProductBrand> lis=service.getAllRecord();
	map.addAttribute("list",lis);
	
	return "AllRecords";
}

}
