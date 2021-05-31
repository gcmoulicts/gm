package com.gm.rtc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gm.rtc.model.VescomEdit;

@Repository
public interface VescomEditRepository extends JpaRepository<VescomEdit, String>{

}
