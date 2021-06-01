package com.gm.rtc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gm.rtc.model.ProgramData;
import com.gm.rtc.serviceImpl.ProgramDataServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@RestController
@RequestMapping("/programdata")
@Api(value = "Item Resource to handle all Item related action and queries ")
public class ProgramDataController {

	@Autowired
	ProgramDataServiceImpl programDataService; 
	
	@ApiOperation(value = "Return all Items available in the System", response = ProgramData.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@PostMapping
	public ResponseEntity<ProgramData> save(@RequestBody ProgramData programDataRequest){
		ProgramData programData = programDataService.save(programDataRequest);
		return new ResponseEntity<ProgramData>(programData, HttpStatus.OK);
	}


	@ApiOperation(value = "Return all Items available in the System", response = ProgramData.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@PatchMapping
	public ResponseEntity<ProgramData> edit(@RequestBody ProgramData programDataRequest){
		ProgramData programData = programDataService.save(programDataRequest);
		return new ResponseEntity<ProgramData>(programData, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Return all Items available in the System", response = Boolean.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable String id){
		programDataService.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	@ApiOperation(value = "Return all Items available in the System", response = ProgramData.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProgramData> get(@PathVariable String id){
		ProgramData programData = programDataService.get(id);
		return new ResponseEntity<ProgramData>(programData, HttpStatus.OK);
	}
	
	
	@ApiOperation(value = "Return all Items available in the System", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@GetMapping(value = "/fetchall")
	public ResponseEntity<List<ProgramData>> fetchAll(){
		List<ProgramData> programDatas = programDataService.findAll();
		return new ResponseEntity<List<ProgramData>>(programDatas, HttpStatus.OK);
	}
	
}
