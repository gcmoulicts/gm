package com.gm.rtc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gm.rtc.model.Vescom;

@Repository
public interface VescomRepository extends JpaRepository<Vescom, String>{

}
