package com.gm.rtc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name="Vescom")
public class Vfrp {
	
	@Id
	@Column(name="ID")
	String id;
	
	@Column(name="summary")
	String summary;
	
	@Column(name="functionalArcElDes")
	String functionalArcElDes;
	
	@Column(name="functArchElemClass")
	String functArchElemClass;
	
	@Column(name="functionalDomain")
	String functionalDomain;
	
	@Column(name="ownedBy")
	String ownedBy;
	
	@Column(name="status")
	String status; 
	
	@Column(name="description")
	String description;
	
	@Column(name="introductoryModelYear")
	String introductoryModelYear;
	
	@Column(name="major")
	String major; 
	
	@Column(name="minor")
	String minor;
	
	@Column(name="introCadence")
	String introCadence;
	
	@Column(name="retireMajor")
	String retireMajor;
	
	@Column(name="retireMinor")
	String retireMinor;
	
	@Column(name="retireCadence")
	String retireCadence; 
}
