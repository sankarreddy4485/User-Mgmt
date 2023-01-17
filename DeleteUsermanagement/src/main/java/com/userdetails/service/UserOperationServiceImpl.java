package com.userdetails.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userdetails.dto.UserDTO;
import com.userdetails.entity.User;
import com.userdetails.repository.UserRepository;
@Service
public class UserOperationServiceImpl implements UserOperationService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void deleteUserbyID(Integer id) throws Exception {
		Optional<User> optional=userRepository.findById(id);
		optional.orElseThrow(() -> new Exception("Service.USER_NOT_FOUND"));
		userRepository.deleteById(id);
	}

	@Override
	public Integer updateUserbyID(Integer id,UserDTO userDTO) throws Exception {
		Optional<User> optional=userRepository.findById(id);
		User userEntity= optional.orElseThrow(() -> new Exception("Service.USER_NOT_FOUND"));
		userEntity.setName(userDTO.getName());
		userEntity.setUserName(userDTO.getUserName());
		userEntity.setEmail(userDTO.getEmail());
		userEntity.setPhone(userDTO.getPhone());
		userEntity.setWebsite(userDTO.getWebsite());
		User userentity1 = userRepository.save(userEntity);
		
		return userentity1.getId();
		
	}

}
