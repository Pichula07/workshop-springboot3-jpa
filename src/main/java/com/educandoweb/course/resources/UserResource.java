package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users") // CRIA O ENDPOINT EX: Localhost:8080/users. abre os users
public class UserResource {
	
	@GetMapping // Mapeia usando response, para buscar os usuarios
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria", "Maria@gmail.com", "99999","12345");
		return ResponseEntity.ok().body(u);
	}
}
