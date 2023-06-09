package com.springboot.app.item.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.app.item.models.Product;

@FeignClient(name = "products-service", url = "localhost:8001")
public interface ProductRestClient {
	
	@GetMapping("/list")
	public List<Product> list();
	
	@GetMapping("/detail/{id}")
	public Product detail(@PathVariable Long id);

}
