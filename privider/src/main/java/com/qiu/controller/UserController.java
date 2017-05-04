package com.qiu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.qiu.dao.UserDao;
import com.qiu.entity.User;

@RestController
public class UserController {

	@Autowired
	private UserDao userDao;
	
	@GetMapping("/findById/{id}")
	public User findById(@PathVariable("id") Long id){
		return userDao.findOne(id);
	}
}
