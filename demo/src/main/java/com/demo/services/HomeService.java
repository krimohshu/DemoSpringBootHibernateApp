package com.demo.services;

import com.demo.request.HomeRequest;
import com.demo.response.HomeResponse;

public interface HomeService {
	
	public HomeResponse homeServices(String userName);
	public void createUser(HomeRequest homerequest);
	public void updateUser(HomeRequest homerequest);

}
