package com.example.spring_azure_demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class SpringAzureController {

	@GetMapping("/azure")
	public String welcomeToAzure() {
		return "Welcome to Azure!!!";
	}

}
