package com.gm.auth.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gm.auth.model.LoginRequest;
import com.gm.auth.model.LoginResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/auth")
@Api(value = "Momentum Data Resource to handle all controller related action and queries ")
public class AuthController {

	
	@ApiOperation(value = "Search momentum data by id", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@PostMapping(value = "/login")
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
		LoginResponse loginResponse = new LoginResponse();
		loginResponse.setUsername(loginRequest.getUsername());
		loginResponse.setPassword(loginRequest.getPassword());
		return new ResponseEntity<LoginResponse>(loginResponse, HttpStatus.OK);
	}
	

	@ApiOperation(value = "Search momentum data by id", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@PostMapping(value = "/logingmid")
	public ResponseEntity<LoginResponse> loginViaGmid(@RequestBody String gmId){
		LoginResponse loginResponse = new LoginResponse();
		loginResponse.setUsername(gmId);
		loginResponse.setPassword("no password");
		return new ResponseEntity<LoginResponse>(loginResponse, HttpStatus.OK);
	}
	
	
}
