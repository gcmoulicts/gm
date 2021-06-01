package com.gm.rtc.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gm.rtc.model.ProgramData;
import com.gm.rtc.repository.ProgramDataRepository;

@Service
public class ProgramDataServiceImpl {

	@Autowired
	private ProgramDataRepository programDataRepository;
	
	public ProgramData save(ProgramData programData){
		programData.setId(UUID.randomUUID().toString());
		ProgramData controller = programDataRepository.save(programData);
		return controller;
	}
	
	public ProgramData get(String id){
		return programDataRepository.getById(id);
	}

	public boolean delete(String id){
		ProgramData controller = programDataRepository.getById(id);
		programDataRepository.delete(controller);
		return true;
	}
	
	public List<ProgramData>findAll(){
		return programDataRepository.findAll();
	}
	
}
