package com.gm.rtc.serviceImpl;

import java.util.List;
import java.util.Optional;
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
		Optional<ProgramData> optional = programDataRepository.findById(id);
		return optional.get();
	}

	public boolean delete(String id){
		Optional<ProgramData> optional = programDataRepository.findById(id);
		ProgramData programData = optional.get();
		programDataRepository.delete(programData);
		return true;
	}
	
	public List<ProgramData>findAll(){
		return programDataRepository.findAll();
	}
	
}
