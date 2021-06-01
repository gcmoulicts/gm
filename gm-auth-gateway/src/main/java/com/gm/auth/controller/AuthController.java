package com.gm.auth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gm.auth.model.LoginRequest;
import com.gm.auth.model.LoginResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/auth")
public class AuthController {

	
	@Operation(summary = "login by posting username and password")
	@ApiResponse(responseCode = "200", description = "OK")
	@PostMapping(value = "/login")
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
		LoginResponse loginResponse = new LoginResponse();
		loginResponse.setUsername(loginRequest.getUsername());
		loginResponse.setPassword(loginRequest.getPassword());
		return new ResponseEntity<LoginResponse>(loginResponse, HttpStatus.OK);
	}
	

	@Operation(summary = "login by posting username and password")
	@ApiResponse(responseCode = "200", description = "OK")
	@PostMapping(value = "/logingmid")
	public ResponseEntity<LoginResponse> loginViaGmid(@RequestBody String gmId){
		LoginResponse loginResponse = new LoginResponse();
		loginResponse.setUsername(gmId);
		loginResponse.setPassword("no password");
		return new ResponseEntity<LoginResponse>(loginResponse, HttpStatus.OK);
	}
	
	
}
