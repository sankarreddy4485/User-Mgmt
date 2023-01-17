package com.userdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userdetails.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
