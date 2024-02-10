package com.company.dao;

import com.company.dao.User;

public interface UserDao {

	boolean addUser(User user);
	boolean isValidUser(String username, String password);
}
