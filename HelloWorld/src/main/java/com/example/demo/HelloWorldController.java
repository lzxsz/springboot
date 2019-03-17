package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
public class HelloWorldController {
	@RequestMapping("/helloworld")
	public String helloworld() {
		//System.err.println("error info");		
		System.out.println("Hello OK");  //show input tips: alt + /
		return "Hello World";
	}
}
