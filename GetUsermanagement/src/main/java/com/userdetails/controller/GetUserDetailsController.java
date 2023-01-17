package com.userdetails.controller;

import java.util.List;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userdetails.dto.UserDto;
import com.userdetails.service.GetUserDetailsService;

@RestController
@RequestMapping("/user-mgmt")
public class GetUserDetailsController {
	
	@Autowired
	GetUserDetailsService getUserDetailsService;
	
	@GetMapping("/userdetails")
	public List<UserDto> getUserDetails(){
		return getUserDetailsService.getAllCustomer();
		
	}
	@GetMapping("/userdetails/{id}")
	public UserDto getUserDetailsbyId(@PathVariable int id) throws Exception{
		UserDto userDto= getUserDetailsService.getCustomerDetails(id);
		return userDto;
		
		
	}

}
