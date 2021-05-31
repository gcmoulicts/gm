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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/momentum")
public class SearchMomentum{


	@Operation(summary = "Return list of momentum data when search by ids")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/search/{projectIds}")
	public ResponseEntity<List<Project>> searchByMomentumId(@PathVariable Set<String> projectIds){
		ArrayList<Project> arrayList = new ArrayList<Project>();
		Map<String, Project> projectData = StaticDataUtil.getProjectData();
		for (String projectId : projectIds) {
			arrayList.add(projectData.get(projectId));
		}
		return new ResponseEntity<List<Project>>(arrayList, HttpStatus.OK);
	}


	@Operation(summary = "Return project of momentum to populate dropdown")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping(value = "/loadall")
	public ResponseEntity<Set<String>> loadAllIds(@PathVariable String projectId){
		Map<String, Project> projectData = StaticDataUtil.getProjectData();
		return new ResponseEntity<Set<String>>(projectData.keySet(), HttpStatus.OK);
	}

	@Operation(summary = "Return list of momentum name data when search by id")
	@ApiResponse(responseCode = "200", description = "OK")
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
