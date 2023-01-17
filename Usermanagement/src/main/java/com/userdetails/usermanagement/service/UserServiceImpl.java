package com.userdetails.usermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.userdetails.usermanagement.entity.User;
import com.userdetails.usermanagement.model.UserDTO;
import com.userdetails.usermanagement.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public Integer addUser(UserDTO userDTO) {
		User userEntity = new User();
		userEntity.setId(userDTO.getId());
		userEntity.setName(userDTO.getName());
		userEntity.setUserName(userDTO.getUserName());
		userEntity.setEmail(userDTO.getEmail());
		userEntity.setPhone(userDTO.getPhone());
		userEntity.setWebsite(userDTO.getWebsite());
		User userentity1 = userRepository.save(userEntity);
		return userentity1.getId();
		
	}

	@Override
	public List<UserDTO> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
