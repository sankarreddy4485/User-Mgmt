package com.userdetails.usermanagement.service;

import java.util.List;

import com.userdetails.usermanagement.model.UserDTO;

public interface UserService {
	
	public Integer addUser(UserDTO userDTO);
	public List<UserDTO> getAllCustomer();
	

}
