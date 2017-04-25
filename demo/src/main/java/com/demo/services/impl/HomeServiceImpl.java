package com.demo.services.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.HomeDAO;
import com.demo.entity.User;
import com.demo.request.HomeRequest;
import com.demo.response.HomeResponse;
import com.demo.services.HomeService;

@Service("homeService")
@Transactional
public class HomeServiceImpl implements HomeService {
	
	private static Logger logger = LoggerFactory.getLogger(HomeServiceImpl.class);

	@Autowired
	private HomeDAO homeRepository;

	public HomeResponse homeServices(String userName) {
		User user = homeRepository.getUserInfo(userName);
		HomeResponse oHomeResponse = new HomeResponse();
		oHomeResponse.setUserName(user.getUserName());
		oHomeResponse.setFirstName(user.getFirstName());
		oHomeResponse.setLastName(user.getLastName());
		logger.info("Response: " + oHomeResponse.toString());
		return oHomeResponse;
	}

	
	public void createUser(HomeRequest homerequest) {
		User user = new User(homerequest.getUserName(), homerequest.getFirstName(), homerequest.getLastName(), null);
		homeRepository.saveUser(user);
	}


	public void updateUser(HomeRequest homerequest) {
		 
		User user = new User(homerequest.getId(), homerequest.getUserName(), homerequest.getFirstName(), homerequest.getLastName(), null);
		
		homeRepository.updateUser(user);
	}

}
