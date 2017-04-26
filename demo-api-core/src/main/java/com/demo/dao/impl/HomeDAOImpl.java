package com.demo.dao.impl;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.HomeDAO;
import com.demo.entity.User;

@Repository("homeRepository")
@Transactional
public class HomeDAOImpl implements HomeDAO {

	private static Logger logger = LoggerFactory.getLogger(HomeDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void saveUser(User user) {
		getSession().save(user);
	}

	public User getUserInfo(String userName) {

		User newUser = new User(userName, "Dhirendra", "Bhargav", 25);

		// newUser.setAddress(new Address("12/219", "Bichuri wali gali",
		// "Bhagalpur", "Bihar", 253252));

		return newUser;
	}

	public void updateUser(User user) {
		getSession().saveOrUpdate(user);
	}

}
