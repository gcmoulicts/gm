package com.gm.auth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Operation(summary = "Return list of momentum data when search by id")
	@ApiResponse(responseCode = "200", description = "OK")
	@PostMapping(value = "/login")
	public ResponseEntity<String> save(){
		return new ResponseEntity<String>("login done", HttpStatus.OK);
	}
	
	
}
