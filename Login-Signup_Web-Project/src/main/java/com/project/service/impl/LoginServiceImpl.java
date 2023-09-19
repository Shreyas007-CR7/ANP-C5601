package com.project.service.impl;

import com.project.dao.LoginDao;
import com.project.dao.impl.LoginDaoImpl;
import com.project.dto.UserDTO;
import com.project.service.LoginService;

public class LoginServiceImpl implements LoginService {
	
	LoginDao dao = new LoginDaoImpl();

	@Override
	public boolean authenticate(String username, String password) {
		UserDTO user = dao.searchUser(username);
		if(user != null) {
			if(username.equals(user.getEmail()) && password.equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}

}
