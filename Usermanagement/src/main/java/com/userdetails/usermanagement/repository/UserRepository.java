package com.userdetails.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userdetails.usermanagement.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
