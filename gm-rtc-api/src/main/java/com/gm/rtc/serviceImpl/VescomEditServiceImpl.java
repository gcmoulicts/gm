package com.gm.rtc.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gm.rtc.model.VescomEdit;
import com.gm.rtc.repository.VescomEditRepository;

@Service
public class VescomEditServiceImpl {


	@Autowired
	private VescomEditRepository vescomEditRepository;
	
	public VescomEdit save(VescomEdit vescomEditRequest){
		vescomEditRequest.setId(UUID.randomUUID().toString());
		VescomEdit vescomEdit = vescomEditRepository.save(vescomEditRequest);
		return vescomEdit;
	}
	
	public VescomEdit get(String id){
		return vescomEditRepository.getById(id);
	}

	public boolean delete(String id){
		VescomEdit vescomEdit = vescomEditRepository.getById(id);
		vescomEditRepository.delete(vescomEdit);
		return true;
	}
	
	public List<VescomEdit>findAll(){
		return vescomEditRepository.findAll();
	}

	
}
