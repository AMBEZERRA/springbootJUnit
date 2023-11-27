package com.estudospringboot.JUnit.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estudospringboot.JUnit.domain.User;

@Controller
@RequestMapping(value = "/user" )
public class UserResource {
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		
		return ResponseEntity.ok().body(new User(id, "Allisson", "allisson.geografia@gmail.com", "12345"));
		
	}
	

}
