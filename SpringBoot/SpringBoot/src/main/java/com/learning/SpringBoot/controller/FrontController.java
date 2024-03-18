package com.learning.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    @GetMapping("/api/getData")
	public String getMsg(){
		return "Good morning..We are working on Spring boot";
	}
}
