package com.iamneo.ecom.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iamneo.ecom.admin.model.Product;
import com.iamneo.ecom.admin.service.AdminService;
@RestController
@RequestMapping("/api")
public class AdminController {
	
	@Autowired
	AdminService adminSer;

    @PostMapping("/addproduct")
    public Product saveProduct(@RequestBody Product product) {
    	System.out.println("reached admn controller:::");
        return adminSer.saveProduct(product);
    }
    
    @DeleteMapping("/deleteproduct/{id}")
    public void deleteProduct(@PathVariable Long id) {
    	adminSer.deleteProduct(id);
    }
}
