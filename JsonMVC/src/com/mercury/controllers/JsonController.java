package com.mercury.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mercury.beans.User;

@Controller
@RequestMapping("/json")
public class JsonController {
	@RequestMapping(value="{name}", method=RequestMethod.GET)
	public @ResponseBody User getUserInJson(@PathVariable String name) {
		User user = new User();
		user.setName(name);
		user.setAge(38);
		return user;
	}
}
