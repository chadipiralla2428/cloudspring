package com.example.awsdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/awsdemo")
public class AwsController {
	@GetMapping("/{name}")
	public String awsDemo(@PathVariable String name) {
		return "Welcome to Aws Devops:"+ name;
	}

}
