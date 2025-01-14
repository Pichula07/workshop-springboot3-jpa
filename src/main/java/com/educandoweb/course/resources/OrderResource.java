package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders") // CRIA O ENDPOINT EX: Localhost:8080/Orders. abre os Orders
public class OrderResource { //Order resource depende do Order service, injetado automaticamente com autowired.
	
	@Autowired
	private OrderService service;
	
	@GetMapping // Mapeia usando response, para buscar as orders
	public ResponseEntity<List<Order>> findAll(){
		
		List <Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	
}
