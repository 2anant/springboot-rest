package com.in28m.restfulwebservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloworldController {

	@RequestMapping(method = RequestMethod.GET, path = {"/hi"})
	String sayHello() {
		return "Hi";
	}
	
	@GetMapping(path="/hello-world-bean")
	HelloWorldBean getHelloWorld() {
		return new HelloWorldBean("Hello");
	}

}
