package com.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.dao.ProductDao;
import com.spring.dao.ProductService;
import com.spring.entity.Product;

@Controller
public class HomeController {
	
	@Autowired
 private ProductDao productdao;
	
	@Autowired
	private ProductService productservice;
	
	
	@RequestMapping("/")
	public String home() {
		return "addProduct";
	}
	
	@RequestMapping(value="/addProduct",method = RequestMethod.POST)
	public void addProduct(@ModelAttribute("product") Product product) {
		this.productdao.save(product);
	}
	@GetMapping("/product")
	@ResponseBody
	public List<Product> viewProduct() {
	Iterable<Product> findAll = this. productdao.findAll();
	return (List<Product>) findAll;
		
	
	}
	@DeleteMapping("/dproduct/{productid}")
	
	public void deleteProduct( @PathVariable("productid") int productid) {
		
		this.productdao.deleteById(productid);
	}
	@GetMapping("/product/{pId}")
	public Product getProduct(@PathVariable("pId") int pId) {
		
		Product productById = productservice.getProductById(pId);
		return productById;
		
	}
	
}
