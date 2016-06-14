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
		user.setName("Purushotham");
		user.setName("Purushotham.thalari@gmail.com");

		User user1 = new User();
		user1.setName("Kuppu");
		user1.setName("Kuppu@gmail.com");
		users.add(user);
		users.add(user1);
		return users;
	}

}