package com.gm.rtc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gm.rtc.model.Controller;

@Repository
public interface ControllerRepository extends JpaRepository<Controller, String>{

}
