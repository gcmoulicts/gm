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

import com.gm.rtc.model.Vfrp;
import com.gm.rtc.serviceImpl.VfrpServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/vfrp")
@Api(value = "Resource to handle all Vfrp related action and queries ")
public class VfrpController {


	@Autowired
	VfrpServiceImpl vfrpService; 
	

	@ApiOperation(value = "Save Vfrp data in the RTC System", response = Vfrp.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@PostMapping
	public ResponseEntity<Vfrp> save(@RequestBody Vfrp vfrpRequest){
		Vfrp vfrp = vfrpService.save(vfrpRequest);
		return new ResponseEntity<Vfrp>(vfrp, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Update Vfrp data in the RTC System", response = Vfrp.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@PatchMapping
	public ResponseEntity<Vfrp> edit(@RequestBody Vfrp vfrpRequest){
		Vfrp vfrp = vfrpService.save(vfrpRequest);
		return new ResponseEntity<Vfrp>(vfrp, HttpStatus.OK);
	}
	

	@ApiOperation(value = "Get Vfrp data in the RTC System", response = Vfrp.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@GetMapping(value = "/{id}")
	public ResponseEntity<Vfrp> get(@PathVariable String id){
		Vfrp Vfrp = vfrpService.get(id);
		return new ResponseEntity<Vfrp>(Vfrp, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Delete Vfrp available in the System", response = Boolean.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable String id){
		vfrpService.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Return all Vfrp available in the System", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@GetMapping(value = "/fetchall")
	public ResponseEntity<List<Vfrp>> fetchAll(){
		List<Vfrp> vfrp = vfrpService.findAll();
		return new ResponseEntity<List<Vfrp>>(vfrp, HttpStatus.OK);
	}
	
	
}
