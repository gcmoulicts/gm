package com.gm.rtc;

import com.gm.rtc.config.RTCLogin;

public class TestRTCLogin {

	public static void main(String[] args) {

		String repositoryUri = "";
		String username = "";
		String password = "";
		String workspace = "";
		String component = "";

		RTCLogin rtcLogin = new RTCLogin();
		rtcLogin.veridyRTC(repositoryUri, username, password, workspace, component);
	}

}
