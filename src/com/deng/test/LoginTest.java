package com.deng.test;

import java.util.HashMap;
import java.util.Map;
import com.deng.model.UserInfo;

public class LoginTest {
	
	public LoginTest(){
		this.userInfoMap = new HashMap<String,UserInfo>();
	}
	
	private Map<String,UserInfo> userInfoMap;
	private static final String USER_INFO_MAP = "userInfoMap";
	
	public static void main(String[] args) {
		
	}
	
	private void login(String userName,String userPwd){
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName(userName);
		userInfo.setUserPwd(userPwd);
		userInfoMap.put(userInfo.getUserName(), userInfo);
	}

	public Map<String, UserInfo> getUserInfoMap() {
		return userInfoMap;
	}

	public void setUserInfoMap(Map<String, UserInfo> userInfoMap) {
		this.userInfoMap = userInfoMap;
	}
}
