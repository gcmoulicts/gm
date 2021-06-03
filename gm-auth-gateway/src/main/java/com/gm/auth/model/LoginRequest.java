package com.gm.auth.model;

import lombok.Data;

@Data
public class LoginRequest {
	
	String repositoryUri; 
	String username; 
	String password; 
	String workspace; 
	String component;
	
}
