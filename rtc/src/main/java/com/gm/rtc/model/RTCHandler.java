package com.gm.rtc.model;

import com.ibm.team.repository.client.ITeamRepository;
import com.ibm.team.scm.client.IWorkspaceConnection;
import com.ibm.team.scm.common.IComponentHandle;

import lombok.Data;

@Data
public class RTCHandler {

	private ITeamRepository repo;
	private IWorkspaceConnection conn;
	private IComponentHandle cmp;
	
}
