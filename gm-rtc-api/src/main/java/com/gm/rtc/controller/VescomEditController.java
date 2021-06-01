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

import com.gm.rtc.model.VescomEdit;
import com.gm.rtc.serviceImpl.VescomEditServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/vescomedit")
@Api(value = "Item Resource to handle all Item related action and queries ")
public class VescomEditController {

	@Autowired
	VescomEditServiceImpl vescomEditService; 
	
	@ApiOperation(value = "Return all Items available in the System", response = VescomEdit.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@PostMapping
	public ResponseEntity<VescomEdit> save(@RequestBody VescomEdit vescomEdit){
		VescomEdit vescomEditResponse = vescomEditService.save(vescomEdit);
		return new ResponseEntity<VescomEdit>(vescomEditResponse, HttpStatus.OK);
	}
	

	@ApiOperation(value = "Return all Items available in the System", response = VescomEdit.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@PatchMapping
	public ResponseEntity<VescomEdit> edit(@RequestBody VescomEdit vescomEdit){
		VescomEdit vescomEditResponse = vescomEditService.save(vescomEdit);
		return new ResponseEntity<VescomEdit>(vescomEditResponse, HttpStatus.OK);
	}
	

	@ApiOperation(value = "Return all Items available in the System", response = VescomEdit.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@GetMapping(value = "/{id}")
	public ResponseEntity<VescomEdit> get(@PathVariable String id){
		VescomEdit vescomEdit = vescomEditService.get(id);
		return new ResponseEntity<VescomEdit>(vescomEdit, HttpStatus.OK);
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
		vescomEditService.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Return all Items available in the System", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@GetMapping(value = "/fetchall")
	public ResponseEntity<List<VescomEdit>> fetchAll(){
		List<VescomEdit> vescomEdit = vescomEditService.findAll();
		return new ResponseEntity<List<VescomEdit>>(vescomEdit, HttpStatus.OK);
	}
	
	
}
