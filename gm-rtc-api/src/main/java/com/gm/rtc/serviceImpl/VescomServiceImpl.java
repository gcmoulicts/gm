package com.gm.rtc.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gm.rtc.model.Vescom;
import com.gm.rtc.repository.VescomRepository;

@Service
public class VescomServiceImpl {
	
	@Autowired
	private VescomRepository vescomRepository;
	
	public Vescom save(Vescom VescomRequestRequest){
		VescomRequestRequest.setId(UUID.randomUUID().toString());
		Vescom vescom = vescomRepository.save(VescomRequestRequest);
		return vescom;
	}
	
	public Vescom get(String id){
		return vescomRepository.getById(id);
	}

	public boolean delete(String id){
		Vescom vescom = vescomRepository.getById(id);
		vescomRepository.delete(vescom);
		return true;
	}
	
	public List<Vescom>findAll(){
		return vescomRepository.findAll();
	}

}
