package com.userdetails.service;

import com.userdetails.dto.UserDTO;

public interface UserOperationService {
	
	
	public void deleteUserbyID(Integer id) throws Exception;

	public Integer updateUserbyID(Integer id, UserDTO userDto) throws Exception;

}
