package com.gm.rtc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gm.rtc.model.Vfrp;

@Repository
public interface VfrpRepository extends JpaRepository<Vfrp, String>{

}
