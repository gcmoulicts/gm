package com.gm.rtc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Vescom")
public class VescomEdit {
	
	@Id
	@Column(name="ID")
	String id;
	
	@Column(name="program")
	String program;
	
	@Column(name="modelYear")
	String modelYear;
	
	@Column(name="electricalArchitecture")
	String electricalArchitecture;
	
	@Column(name="veSCoM")
	String veSCoM;
	
	@Column(name="baselineArchitectureLevel")
	String baselineArchitectureLevel;
	
	@Column(name="programVariant")
	String programVariant;
	
	@Column(name="event")
	String event;
	
	@Column(name="gVDP")
	String gVDP;
	
	@Column(name="dVUL")
	String dVUL;
	
	@Column(name="notes")
	String notes;
	
	@Column(name="eventDate")
	String eventDate;
	
	@Column(name="lastModifiedDate")
	String lastModifiedDate;
	
}
