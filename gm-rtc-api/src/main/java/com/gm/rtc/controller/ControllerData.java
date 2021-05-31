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

import com.gm.rtc.model.Controller;
import com.gm.rtc.repository.ControllerRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/controllerdata")
public class ControllerData {

	
	@Autowired
	private ControllerRepository controllerRepository;  
	
	@Operation(summary = "Save data")
	@ApiResponse(responseCode = "200", description = "OK")
	@PostMapping(value = "/save")
	public ResponseEntity<Controller> save(@RequestBody Controller controller){
		controller.setId(UUID.randomUUID().toString());
		controllerRepository.save(controller);
		return new ResponseEntity<Controller>(controller, HttpStatus.OK);
	}
	

	@Operation(summary = "get data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<Controller> get(@PathVariable String id){
		Controller controller = controllerRepository.getById(id);
		return new ResponseEntity<Controller>(controller, HttpStatus.OK);
	}
	

	@Operation(summary = "delete data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<Controller> delete(@PathVariable String id){
		Controller controller = controllerRepository.getById(id);
		controllerRepository.delete(controller);
		return new ResponseEntity<Controller>(controller, HttpStatus.OK);
	}
	
	@Operation(summary = "all data")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/getall")
	public ResponseEntity<List<Controller>>findAll(){
		List<Controller> controllers = controllerRepository.findAll();
		return new ResponseEntity<List<Controller>>(controllers, HttpStatus.OK);
	}
	
	
	
	
}
