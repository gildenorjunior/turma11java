package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping //sempre que eu chamar o método Get em Hello ele vai chamar esse método
	public String hello() {
		return "Olá Mundo!";
	}
}
