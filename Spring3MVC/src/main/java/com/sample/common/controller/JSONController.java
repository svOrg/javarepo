package com.sample.common.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.common.model.User;

@Controller
@RequestMapping("/users")
public class JSONController {

	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public @ResponseBody List<User> getUsersJSON(@PathVariable String name) {
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setName("purushotham");
		user.setName("Purushotham.thalari@gmail.com");

		User user1 = new User();
		user1.setName("kuppu");
		user1.setName("kuppu@gmail.com");
		if(user.getName().contains(name)){
			users.add(user);
		}
		if(user1.getName().contains(name)){
			users.add(user1);
		}
		return users;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<User> getAllUsersJSON() {
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setName("Purushotham");
		user.setName("Purushotham.thalari@gmail.com");

		User user1 = new User();
		user1.setName("Kuppu");
		user1.setName("Kuppu@gmail.com");
		
		User user2 = new User();
		user2.setName("Sandy");
		user2.setName("Sandy@gmail.com");
		users.add(user2);
		users.add(user);
		users.add(user1);
		return users;
	}

}