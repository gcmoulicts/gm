package com.gm.rtc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CONTROLLER")
public class Controller implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	String id;

	@Column(name="NAME")
	String name;

    @Column(name="CONTROLLERSMANUALLY")
	String controllersManually;

    @Column(name="CONTROLLERSTABLE")
    String controllersTable;

}
