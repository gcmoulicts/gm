package com.gm.rtc.model;

import com.ibm.team.repository.client.ITeamRepository;
import com.ibm.team.repository.client.ITeamRepository.ILoginHandler;
import com.ibm.team.repository.client.ITeamRepository.ILoginHandler.ILoginInfo;

import lombok.Data;

@Data class LoginHandler implements ILoginHandler, ILoginInfo {

	private String fUserId;
	private String fPassword;

	private LoginHandler(String userId, String password) {
		fUserId = userId;
		fPassword = password;
	}

	public String getUserId() {
		return fUserId;
	}

	public String getPassword() {
		return fPassword;
	}

	public ILoginInfo challenge(ITeamRepository repository) {
		return this;
	}
}