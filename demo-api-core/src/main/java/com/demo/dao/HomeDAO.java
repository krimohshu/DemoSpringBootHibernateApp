package com.demo.dao;

import com.demo.entity.User;


public interface HomeDAO {

	public void saveUser(User user);

	public User getUserInfo(String userName);

	public void updateUser(User user);
}
