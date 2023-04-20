package com.example.awsdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AwsController {
	@GetMapping("awsspringdemo")
	public ResponseEntity<?> awsDemo() {
		return ResponseEntity.ok("It Works Successfully");
	}

}
