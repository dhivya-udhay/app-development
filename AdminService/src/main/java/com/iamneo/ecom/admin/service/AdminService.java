package com.iamneo.ecom.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamneo.ecom.admin.model.Product;
import com.iamneo.ecom.admin.repository.ProductRepository;
@Service
public class AdminService {
	
	@Autowired
	ProductRepository productRepository;
	
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
