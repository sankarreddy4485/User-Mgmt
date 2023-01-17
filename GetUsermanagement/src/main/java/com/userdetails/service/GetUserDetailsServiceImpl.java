package com.userdetails.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userdetails.dto.UserDto;
import com.userdetails.entity.User;
import com.userdetails.repository.GetUserRepository;
@Service
public class GetUserDetailsServiceImpl implements GetUserDetailsService {

	@Autowired
	GetUserRepository getUserRepository;
	@Override
	public List<UserDto> getAllCustomer() {
		Iterable<User> iterable = getUserRepository.findAll();
		List<UserDto> userDtos = new ArrayList<>();
		
		iterable.forEach(userDto -> {
		UserDto userDto1 = new UserDto();
		userDto1.setId(userDto.getId());
		userDto1.setUserName(userDto.getUserName());
		userDto1.setPhone(userDto.getPhone());
		userDto1.setWebsite(userDto.getWebsite());
		userDto1.setName(userDto.getName());
	    userDto1.setEmail(userDto.getEmail());
	    userDtos.add(userDto1);

		
		});
		return userDtos;
	}
	@Override
	public UserDto getCustomerDetails(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
		Optional<User> optional=getUserRepository.findById(id);
		User user = optional.orElseThrow(() -> new Exception("Service.USER_NOT_FOUND"));
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setUserName(user.getUserName());
		userDto.setEmail(user.getEmail());
		userDto.setPhone(user.getPhone());
		userDto.setWebsite(user.getWebsite());
		return userDto;
	}

}
