package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

	@GetMapping("/test")
	public String test(){
		System.out.println("12345");
		return "tes222222222t";
	}
}
