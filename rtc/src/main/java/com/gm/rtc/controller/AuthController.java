package com.gm.rtc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@PostMapping(value = "/rtclogin")
	public ResponseEntity<String> rtcLogin(@RequestBody String loginRequest){
		return new ResponseEntity<String>("", HttpStatus.OK);
	}

	@PostMapping(value = "/momentumlogin")
	public ResponseEntity<String> momentumLogin(@RequestBody String gmId){
		return new ResponseEntity<String>("", HttpStatus.OK);
	}

	@PostMapping(value = "/logingmid")
	public ResponseEntity<String> loginViaGmid(@RequestBody String gmId){
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
	
}
