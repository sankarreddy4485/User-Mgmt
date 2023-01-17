package com.userdetails.service;

import java.util.List;

import com.userdetails.dto.UserDto;



public interface GetUserDetailsService {
	public List<UserDto> getAllCustomer();

	public UserDto getCustomerDetails(Integer userId) throws Exception;

}
