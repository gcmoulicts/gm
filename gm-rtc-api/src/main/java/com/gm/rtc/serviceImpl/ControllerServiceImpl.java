package com.gm.rtc.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gm.rtc.model.Controller;
import com.gm.rtc.repository.ControllerRepository;

@Service
public class ControllerServiceImpl {

	@Autowired
	private ControllerRepository controllerRepository;
	
	public Controller save(Controller controllerRequest){
		controllerRequest.setId(UUID.randomUUID().toString());
		Controller controller = controllerRepository.save(controllerRequest);
		return controller;
	}
	
	public Controller get(String id){
		return controllerRepository.getById(id);
	}

	public boolean delete(String id){
		Controller controller = controllerRepository.getById(id);
		controllerRepository.delete(controller);
		return true;
	}
	
	public List<Controller>findAll(){
		return controllerRepository.findAll();
	}
}
