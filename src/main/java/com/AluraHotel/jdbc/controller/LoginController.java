package com.AluraHotel.jdbc.controller;

import com.AluraHotel.jdbc.dao.LoginDao;
import com.AluraHotel.jdbc.factory.ConnectionFactory;

public class LoginController {
	private LoginDao loginDao;
	
	public LoginController() {
		var factory = new ConnectionFactory();
		this.loginDao = new LoginDao(factory.reconnection());
	}
	
	public boolean confirmUser(String userName, String password) {
		boolean userExist = false;
		var user = loginDao.ConfirmUser(userName, password);
		
		if(!user.isEmpty()) {
			userExist = true;
		}
		
		return userExist;
				

	}
}
