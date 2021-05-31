package com.gm.rtc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gm.rtc.model.ProgramData;

@Repository
public interface ProgramDataRepository extends JpaRepository<ProgramData, String>{

}
