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

import com.gm.rtc.model.Vfrp;
import com.gm.rtc.repository.VfrpRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/vfrp")
public class VfrpController {


	@Autowired
	VfrpRepository vfrpRepository; 
	
	@Operation(summary = "Save data")
	@ApiResponse(responseCode = "200", description = "OK")
	@PostMapping(value = "/save")
	public ResponseEntity<Vfrp> save(@RequestBody Vfrp vfrp){
		vfrp.setId(UUID.randomUUID().toString());
		vfrpRepository.save(vfrp);
		return new ResponseEntity<Vfrp>(vfrp, HttpStatus.OK);
	}
	

	@Operation(summary = "Save Data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<Vfrp> save(@PathVariable String id){
		Vfrp Vfrp = vfrpRepository.getById(id);
		return new ResponseEntity<Vfrp>(Vfrp, HttpStatus.OK);
	}
	

	@Operation(summary = "Delete Data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<Vfrp> delete(@PathVariable String id){
		Vfrp vfrp = vfrpRepository.getById(id);
		vfrpRepository.delete(vfrp);
		return new ResponseEntity<Vfrp>(vfrp, HttpStatus.OK);
	}
	
	@Operation(summary = "Get All")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/fetchall")
	public ResponseEntity<List<Vfrp>> fetchAll(){
		List<Vfrp> vfrp = vfrpRepository.findAll();
		return new ResponseEntity<List<Vfrp>>(vfrp, HttpStatus.OK);
	}
	
	
}
