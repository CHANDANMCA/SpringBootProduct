package com.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.dao.ProductDao;
import com.spring.entity.Product;

@SpringBootApplication
public class ProductCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCrudApplication.class, args);

		/*
		 * ApplicationContext con = SpringApplication.run(ProductCrudApplication.class,
		 * args); ProductDao bean = con.getBean(ProductDao.class); Product product = new
		 * Product();
		 * 
		 * product.setpId(1); product.setpName("chandan"); product.setpPrice(12222);
		 * product.setpAbout("this is product ");
		 * 
		 * // Product save = bean.save(product);
		 * 
		 * // System.out.println(save);
		 * 
		 * Iterable<Product> findAll = bean.findAll(); findAll.forEach(products ->
		 * System.out.println(products));
		 * 
		 * // update method
		 * 
		 * 
		 * Optional<Product> findById = bean.findById(6); Product product2 =
		 * findById.get(); product2.setpName("orange"); Product save =
		 * bean.save(product2); System.out.println(save);
		 */
	}

}
