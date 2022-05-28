package com.springrestdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping(value="/hello",method=RequestMethod.POST)  //@PosttMapping
	public String sayHello() {
		String msg="Hello Spring Restful Service";
		return msg;
	}

}
