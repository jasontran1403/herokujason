package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/jason")
	public String index() {
		return "Welcome to heroku deployment";
	}
}
