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

import com.gm.rtc.model.Features;
import com.gm.rtc.repository.FeaturesRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/features")
public class FeaturesController {
	
	@Autowired
	private FeaturesRepository featuresRepository;  
	
	@Operation(summary = "Save data")
	@ApiResponse(responseCode = "200", description = "OK")
	@PostMapping(value = "/save")
	public ResponseEntity<Features> save(@RequestBody Features features){
		features.setId(UUID.randomUUID().toString());
		featuresRepository.save(features);
		return new ResponseEntity<Features>(features, HttpStatus.OK);
	}
	

	@Operation(summary = "get data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<Features> get(@PathVariable String id){
		Features features = featuresRepository.getById(id);
		return new ResponseEntity<Features>(features, HttpStatus.OK);
	}
	

	@Operation(summary = "delete data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<Features> delete(@PathVariable String id){
		Features features = featuresRepository.getById(id);
		featuresRepository.delete(features);
		return new ResponseEntity<Features>(features, HttpStatus.OK);
	}
	
	@Operation(summary = "all data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/getall")
	public ResponseEntity<List<Features>>findAll(){
		List<Features> features = featuresRepository.findAll();
		return new ResponseEntity<List<Features>>(features, HttpStatus.OK);
	}

}
