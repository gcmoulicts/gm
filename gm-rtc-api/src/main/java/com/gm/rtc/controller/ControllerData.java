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

import com.gm.rtc.model.Controller;
import com.gm.rtc.serviceImpl.ControllerServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/controllerdata")
@Api(value = "Controller Data Resource to handle all controller related action and queries ")
public class ControllerData {

	@Autowired
	ControllerServiceImpl controllerServiceImpl;


	@ApiOperation(value = "Save controller data", response = Controller.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@PostMapping
	public ResponseEntity<Controller> save(@RequestBody Controller controller){
		controllerServiceImpl.save(controller);
		return new ResponseEntity<Controller>(controller, HttpStatus.OK);
	}


	@ApiOperation(value = "Return all Items available in the System", response = Controller.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@PatchMapping
	public ResponseEntity<Controller> edit(@RequestBody Controller controller){
		controllerServiceImpl.save(controller);
		return new ResponseEntity<Controller>(controller, HttpStatus.OK);
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
		boolean deleteFlag = controllerServiceImpl.delete(id);
		return new ResponseEntity<Boolean>(deleteFlag, HttpStatus.OK);
	}

	@ApiOperation(value = "Return all Items available in the System", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@GetMapping(value = "/getall")
	public ResponseEntity<List<Controller>>findAll(){
		List<Controller> controllers = controllerServiceImpl.findAll();
		return new ResponseEntity<List<Controller>>(controllers, HttpStatus.OK);
	}
	

	@ApiOperation(value = "Return all Items available in the System", response = Controller.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@GetMapping(value = "/{id}")
	public ResponseEntity<Controller> get(@PathVariable String id){
		Controller controller = controllerServiceImpl.get(id);
		log.info("Controller, {}", controller.toString());
		return new ResponseEntity<Controller>(controller, HttpStatus.OK);
	}

}
