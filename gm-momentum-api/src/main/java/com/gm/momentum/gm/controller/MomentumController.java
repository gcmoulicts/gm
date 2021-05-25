package com.gm.momentum.gm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
public class MomentumController {

	@GetMapping("/")
	public String index() {
		return "Hit to momentum";
	}
	
	@GetMapping("/search")
	public String search() {
		return "Hit to momentum search";
	}
	
}
