package com.spring.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Product;


@Service
public class ProductService {
	
	@Autowired
	private ProductDao productdao;
	
	public List<Product> getAllProduct(){
		
		Iterable<Product> list = productdao.findAll();
		
		return (List<Product>) list;
	}
	
	public Product getProductById(int id) {
		Product findById = productdao.findById(id);
		return findById;
		
	}
	
	// delete id
	public Product deleteProduct(int id) {
		productdao.deleteById(id);
		return null ;
		
	}
	
}
