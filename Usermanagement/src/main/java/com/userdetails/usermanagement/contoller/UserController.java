package com.userdetails.usermanagement.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userdetails.usermanagement.model.UserDTO;
import com.userdetails.usermanagement.service.UserService;

@RestController
@RequestMapping("/user-mgmt")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	private Environment environment;
	@PostMapping(value = "/adduser")
	public ResponseEntity<String> addUser(@RequestBody UserDTO user) {
		Integer customerId = userService.addUser(user);
		String successMessage = environment.getProperty("API.INSERT_SUCCESS") + customerId;
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
	}

}
