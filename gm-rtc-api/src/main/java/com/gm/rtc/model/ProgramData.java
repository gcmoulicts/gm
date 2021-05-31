package com.gm.rtc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PROGRAMDATA")
public class ProgramData {
	
	@Id
	@Column(name="ID")
	String 	id;
	
	@Column(name="NAME")
	String	name;
	
	@Column(name="PROGRAMNAME")
	String	programName;
	
	@Column(name="PROGRAMVARIANT")
	String	programVariant;
	
	@Column(name="MOMENTUMIDS")
	String	momentumIDs;
	
	@Column(name="PROJECTIDCHARTROW")
	String	projectIDChartRow;
	
	@Column(name="PROJECTIDCHARTDATA")
	String	projectIDChartdata;
	
	@Column(name="PROGRAMVARIANTSLEFTBOX")
	String	programVariantsLeftBox;
	
	@Column(name="GROUP1DROPDOWNINRIGHTBOX")
	String	group1DropdowninrightBox;
	
	@Column(name="GROUP1RIGHTBOXCONTENTS")
	String	group1Rightboxcontents;
	
	@Column(name="PROGRAMPLAN")
	String	programPlan;
	
	@Column(name="PROGRAMCODE")
	String	programCode;
	
	@Column(name="MODELYEAR")
	String	modelYear;
	
	@Column(name="MOMENTUMID")
	String	momentumID;
	
	@Column(name="ELECTRICALARCHITECTURE")
	String	electricalArchitecture;
	
	@Column(name="ELECTRICALARCHITECTURELEVEL")
	String	electricalArchitectureLevel;
}
