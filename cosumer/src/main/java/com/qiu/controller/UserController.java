package com.qiu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qiu.entity.User;

@RestController
public class UserController {

	@Autowired
	private RestTemplate template;
	
	@GetMapping("/findById/{id}")
	public User findById(@PathVariable("id") Long id){
		return template.getForObject("http://localhost:7900/findById/"+id, User.class);
	}
}
