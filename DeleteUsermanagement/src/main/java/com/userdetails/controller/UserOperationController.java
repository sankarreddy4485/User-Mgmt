package com.userdetails.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userdetails.dto.UserDTO;
import com.userdetails.service.UserOperationService;

@RestController
@RequestMapping("/user-mgmt")
@CrossOrigin(origins = "http://localhost:3000")
public class UserOperationController {
	
	@Autowired
	UserOperationService userOperationService;
	@Autowired
	Environment environment;
	@DeleteMapping("/delete-user/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable Integer id) throws Exception{
		userOperationService.deleteUserbyID(id);
		String successMessage = environment.getProperty("Service.DELETE_SUCCESS");
		return new ResponseEntity<>(successMessage, HttpStatus.OK);
		
	}

	@PutMapping("/update-user/{id}")
	public ResponseEntity<String> updateUserById(@PathVariable Integer id,@RequestBody UserDTO userDto) throws Exception{
		int userid = userOperationService.updateUserbyID(id,userDto);
		String successMessage = environment.getProperty("Service.UPDATE_SUCCESS"+userid);
		return new ResponseEntity<>(successMessage, HttpStatus.OK);
		
	}
}
