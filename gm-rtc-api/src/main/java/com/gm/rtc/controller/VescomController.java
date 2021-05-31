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

import com.gm.rtc.model.Vescom;
import com.gm.rtc.repository.VescomRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/vescom")
public class VescomController {
	
	@Autowired
	VescomRepository vescomRepository; 
	
	
	@Operation(summary = "Save data")
	@ApiResponse(responseCode = "200", description = "OK")
	@PostMapping(value = "/save")
	public ResponseEntity<Vescom> save(@RequestBody Vescom vescom){
		vescom.setId(UUID.randomUUID().toString());
		vescomRepository.save(vescom);
		return new ResponseEntity<Vescom>(vescom, HttpStatus.OK);
	}
	

	@Operation(summary = "Save Data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<Vescom> save(@PathVariable String id){
		Vescom vescom = vescomRepository.getById(id);
		return new ResponseEntity<Vescom>(vescom, HttpStatus.OK);
	}
	

	@Operation(summary = "Delete Data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<Vescom> delete(@PathVariable String id){
		Vescom vescom = vescomRepository.getById(id);
		vescomRepository.delete(vescom);
		return new ResponseEntity<Vescom>(vescom, HttpStatus.OK);
	}
	
	@Operation(summary = "Get All")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/fetchall")
	public ResponseEntity<List<Vescom>> fetchAll(){
		List<Vescom> vescom = vescomRepository.findAll();
		return new ResponseEntity<List<Vescom>>(vescom, HttpStatus.OK);
	}
	
}
