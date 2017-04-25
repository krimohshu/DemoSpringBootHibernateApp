package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.request.HomeRequest;
import com.demo.response.HomeResponse;
import com.demo.services.HomeService;

@Controller
@RequestMapping("/api/v1")
public class HomeController {

	private static Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private HomeService homeService;

	@RequestMapping(value = "/home/{username}", method = RequestMethod.GET)
	public @ResponseBody HomeResponse home(@PathVariable("username") String userName) {
		return homeService.homeServices(userName);
	}

	@RequestMapping(value = "/home/users", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String createUser(@RequestBody HomeRequest homerequest) {
		homeService.createUser(homerequest);
		return "User created - success";
	}
	
	@RequestMapping(value = "/home/users/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String updateUser(@RequestBody HomeRequest homerequest, @PathVariable("id") Long id) {
		homerequest.setId(id);
		homeService.updateUser(homerequest);
		return "User updated - success";
	}

}
