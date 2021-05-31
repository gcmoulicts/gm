package com.gm.rtc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="FEATURES")
public class Features {
	
	@Id
	@Column(name="ID")
	String id;
	
	@Column(name="EBOF")
	String eBOF;
	
	@Column(name="TREE")
	String tree;
	
	@Column(name="SUMMARYTREE")
	String summaryTree;
	
	@Column(name="FUNCTIONALARCHITECTUREEDT")
	String functionalArchitectureEDT;
	
	@Column(name="FUNCTARCHELEMCLASSTREE")
	String functArchElemClassTree;
	
	@Column(name="FUNCTIONALDOMAINTREE")
	String functionalDomainTree;
	
	@Column(name="OWNEDBYTREE")
	String ownedByTree;
	
	@Column(name="STATUSTREE")
	String statusTree;
	
	@Column(name="DESCRIPTIONTREE")
	String descriptionTree;
	
	@Column(name="INTRODUCTORYMODELYEARTREE")
	String introductoryModelYearTree;
	
	@Column(name="MAJORTREE")
	String majorTree;
	
	@Column(name="MINORTREE")
	String minorTree;
	
	@Column(name="INTROCADENCETREE")
	String introCadenceTree;
	
	@Column(name="RETIREMAJORTREE")
	String retireMajorTree;
	
	@Column(name="RETIREMINORTREE")
	String retireMinorTree;
	
	@Column(name="RETIRECADENCETREE")
	String retireCadenceTree;
}
