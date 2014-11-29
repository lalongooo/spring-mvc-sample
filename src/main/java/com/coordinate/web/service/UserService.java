package com.coordinate.web.service;

import java.util.List;

import com.coordinate.web.entity.User;

public interface UserService {
	public User getUser(String login);
	public User getUserById(Integer id);
	public void addUser(User usuario);
	public void editUser(User usuario);
	public void removeUser(Integer id);
	public List<User> listUser();
	public User getUserByCondition(String condition);
	public List<User> listUserByCondition(String condition);
	
}
