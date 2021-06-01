package com.gm.rtc.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gm.rtc.model.Vfrp;
import com.gm.rtc.repository.VfrpRepository;

@Service
public class VfrpServiceImpl {
	
	@Autowired
	private VfrpRepository vfrpRepository;
	
	public Vfrp save(Vfrp vfrpRequest){
		vfrpRequest.setId(UUID.randomUUID().toString());
		Vfrp Vfrp = vfrpRepository.save(vfrpRequest);
		return Vfrp;
	}
	
	public Vfrp get(String id){
		return vfrpRepository.getById(id);
	}

	public boolean delete(String id){
		Vfrp Vfrp = vfrpRepository.getById(id);
		vfrpRepository.delete(Vfrp);
		return true;
	}
	
	public List<Vfrp>findAll(){
		return vfrpRepository.findAll();
	}

}
