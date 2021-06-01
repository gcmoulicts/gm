package com.gm.momentum.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gm.momentum.entiry.Project;
import com.gm.momentum.util.StaticDataUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/momentum")
@Api(value = "Momentum Data Resource to handle all controller related action and queries ")
public class SearchMomentum{


	@ApiOperation(value = "Search momentum data by id", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@GetMapping(value = "/{projectIds}")
	public ResponseEntity<List<Project>> searchByMomentumId(@PathVariable Set<String> projectIds){
		ArrayList<Project> arrayList = new ArrayList<Project>();
		Map<String, Project> projectData = StaticDataUtil.getProjectData();
		for (String projectId : projectIds) {
			arrayList.add(projectData.get(projectId));
		}
		return new ResponseEntity<List<Project>>(arrayList, HttpStatus.OK);
	}


	@ApiOperation(value = "Fetch all momentum data momentum database", response = Set.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@GetMapping(value = "/loadall")
	public ResponseEntity<Set<String>> loadAllIds(@PathVariable String projectId){
		Map<String, Project> projectData = StaticDataUtil.getProjectData();
		return new ResponseEntity<Set<String>>(projectData.keySet(), HttpStatus.OK);
	}

	@ApiOperation(value = "Fetch all names from momentum database", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully save data"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "Requested Resource Not Found")
	})
	@GetMapping(value = "/names")
	public ResponseEntity<List<String>> searchByMomentumName(){
		List<String> names = new ArrayList<String>();
		names.add("name 1");
		names.add("name 2");
		names.add("name 3");
		names.add("name 4");
		return new ResponseEntity<List<String>>(names, HttpStatus.OK);
	}
}
