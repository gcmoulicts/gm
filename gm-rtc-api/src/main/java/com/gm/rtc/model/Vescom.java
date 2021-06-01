package com.gm.rtc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="VESCOM")
public class Vescom {
	
	@Id
	@Column(name="ID")
	String id;
	
	@Column(name="PROGRAMNAME")
	String programName;
	
//	@Column(name="BASELINEARCHITECTURELEVEL")
//	String baselineArchitectureLevel;
	
	@Column(name="ECSCADENCETIMING")
	String eCSCadenceTiming;
	
	@Column(name="RELEASETOPROGRAMBENCH")
	String releasetoProgramBench;
	
	@Column(name="INTEGRATIONRELEASE1")
	String integrationRelease1;
	
	@Column(name="INTEGRATIONRELEASE2")
	String integrationRelease2;
	
	@Column(name="SWCALFREEZE")
	String swCalFreeze;
	
	@Column(name="VEHICLEDVULTEST")
	String vehicleDVULTest;
	
	@Column(name="RELEASEDATE")
	String releaseDate;
	
	@Column(name="VESCOMNOTES")
	String veSCoMNotes;
	
	@Column(name="MOMENTUMDATA")
	String momentumData;

}
