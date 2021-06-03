package com.gm.serviceImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.springframework.stereotype.Service;

import com.ibm.team.filesystem.client.internal.rest.util.LoginUtil.LoginHandler;
import com.ibm.team.process.client.IProcessClientService;
import com.ibm.team.repository.client.ITeamRepository;
import com.ibm.team.repository.client.TeamPlatform;
import com.ibm.team.repository.common.TeamRepositoryException;
import com.ibm.team.workitem.client.IAuditableClient;
import com.ibm.team.workitem.client.IWorkItemClient;
import com.ibm.team.workitem.common.model.IWorkItem;

@Service
public class RTCLoginServiceImpl {

	public void login(String userId, String password, String repositoryURI) throws TeamRepositoryException {
		IProgressMonitor monitor = new NullProgressMonitor();
		ITeamRepository teamRepository = TeamPlatform.getTeamRepositoryService().getTeamRepository(repositoryURI);
		teamRepository.registerLoginHandler(new LoginHandler(userId, password));
		teamRepository.login(monitor);

		IProcessClientService processClient = (IProcessClientService) teamRepository
				.getClientLibrary(IProcessClientService.class);
		IAuditableClient auditableClient = (IAuditableClient) teamRepository
				.getClientLibrary(IAuditableClient.class);
		IWorkItemClient workItemClient = (IWorkItemClient) teamRepository
				.getClientLibrary(IWorkItemClient.class);


	}


	public void findById(ITeamRepository teamRepository, String idString, IProgressMonitor monitor) throws TeamRepositoryException {
		IWorkItemClient workItemClient = (IWorkItemClient) teamRepository
				.getClientLibrary(IWorkItemClient.class);

		int id = new Integer(idString).intValue();	
		IWorkItem workItem = workItemClient.findWorkItemById(id, IWorkItem.FULL_PROFILE, monitor);

	}

}
