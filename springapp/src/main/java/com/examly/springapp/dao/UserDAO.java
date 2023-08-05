package com.examly.springapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo5.model.User;

public interface UserDAO extends JpaRepository<User, Integer> {

}
