package com.qiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qiu.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{
}
