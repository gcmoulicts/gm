package com.gm.rtc.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gm.rtc.model.VescomEdit;
import com.gm.rtc.repository.VescomEditRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/VescomEditEdit")
public class VescomEditController {

	@Autowired
	VescomEditRepository vescomEditRepository; 
	
	@Operation(summary = "Save data")
	@ApiResponse(responseCode = "200", description = "OK")
	@PostMapping(value = "/save")
	public ResponseEntity<VescomEdit> save(@RequestBody VescomEdit vescomEdit){
		vescomEdit.setId(UUID.randomUUID().toString());
		vescomEditRepository.save(vescomEdit);
		return new ResponseEntity<VescomEdit>(vescomEdit, HttpStatus.OK);
	}
	

	@Operation(summary = "Save Data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<VescomEdit> save(@PathVariable String id){
		VescomEdit vescomEdit = vescomEditRepository.getById(id);
		return new ResponseEntity<VescomEdit>(vescomEdit, HttpStatus.OK);
	}
	

	@Operation(summary = "Delete Data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<VescomEdit> delete(@PathVariable String id){
		VescomEdit vescomEdit = vescomEditRepository.getById(id);
		vescomEditRepository.delete(vescomEdit);
		return new ResponseEntity<VescomEdit>(vescomEdit, HttpStatus.OK);
	}
	
	@Operation(summary = "Get All")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/fetchall")
	public ResponseEntity<List<VescomEdit>> fetchAll(){
		List<VescomEdit> vescomEdit = vescomEditRepository.findAll();
		return new ResponseEntity<List<VescomEdit>>(vescomEdit, HttpStatus.OK);
	}
	
	
}
