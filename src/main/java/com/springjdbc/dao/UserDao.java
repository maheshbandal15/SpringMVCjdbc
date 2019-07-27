package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.model.User;

public interface UserDao {
 
 public List listAllUsers();
 
 public void addUser(User user);
 
 public void updateUser(User user);
 
 public void deleteUser(int id);
 
 public User findUserById(int id);
}