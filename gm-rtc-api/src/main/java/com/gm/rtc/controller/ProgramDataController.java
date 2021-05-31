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

import com.gm.rtc.model.ProgramData;
import com.gm.rtc.repository.ProgramDataRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/programdata")
public class ProgramDataController {

	@Autowired
	ProgramDataRepository programDataRepository; 
	
	
	@Operation(summary = "Save data")
	@ApiResponse(responseCode = "200", description = "OK")
	@PostMapping(value = "/save")
	public ResponseEntity<ProgramData> save(@RequestBody ProgramData programData){
		programData.setId(UUID.randomUUID().toString());
		programDataRepository.save(programData);
		return new ResponseEntity<ProgramData>(programData, HttpStatus.OK);
	}
	

	@Operation(summary = "Save Data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<ProgramData> save(@PathVariable String id){
		ProgramData programData = programDataRepository.getById(id);
		return new ResponseEntity<ProgramData>(programData, HttpStatus.OK);
	}
	

	@Operation(summary = "Delete Data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<ProgramData> delete(@PathVariable String id){
		ProgramData programData = programDataRepository.getById(id);
		programDataRepository.delete(programData);
		return new ResponseEntity<ProgramData>(programData, HttpStatus.OK);
	}
	
	@Operation(summary = "Get All")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/fetchall")
	public ResponseEntity<List<ProgramData>> fetchAll(){
		List<ProgramData> programDatas = programDataRepository.findAll();
		return new ResponseEntity<List<ProgramData>>(programDatas, HttpStatus.OK);
	}
	
}
