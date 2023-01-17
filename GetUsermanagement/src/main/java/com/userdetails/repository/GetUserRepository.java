package com.userdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userdetails.dto.UserDto;
import com.userdetails.entity.User;
@Repository
public interface GetUserRepository extends JpaRepository<User, Integer> {

}
