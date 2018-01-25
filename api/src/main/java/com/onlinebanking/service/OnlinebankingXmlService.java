package com.onlinebanking.service;

import com.onlinebanking.model.Users;

public interface OnlinebankingXmlService {
	
	public Users saveOrUpdateUsers(Users users);

	public void deleteUsers(Users users);
}