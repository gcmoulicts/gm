package com.gm.rtc.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gm.rtc.model.Features;
import com.gm.rtc.repository.FeaturesRepository;

@Service
public class FeaturesServiceImpl {

	@Autowired
	private FeaturesRepository featuresRepository;
	
	public Features save(Features FeaturesRequest){
		FeaturesRequest.setId(UUID.randomUUID().toString());
		Features Features = featuresRepository.save(FeaturesRequest);
		return Features;
	}
	
	public Features get(String id){
		return featuresRepository.getById(id);
	}

	public boolean delete(String id){
		Features Features = featuresRepository.getById(id);
		featuresRepository.delete(Features);
		return true;
	}
	
	public List<Features>findAll(){
		return featuresRepository.findAll();
	}
}
