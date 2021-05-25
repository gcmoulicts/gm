package com.gm.rtc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/rtc")
public class RTCController {

	@Operation(summary = "Return list of momentum data when search by id")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/save")
	public ResponseEntity<String> save(){
		return new ResponseEntity<String>("data save", HttpStatus.OK);
	}
	
	@Operation(summary = "Return list of momentum name data when search by id")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/savedraft")
	public ResponseEntity<String> saveDraft(){
		return new ResponseEntity<String>("data save draft", HttpStatus.OK);
	}
	
}
