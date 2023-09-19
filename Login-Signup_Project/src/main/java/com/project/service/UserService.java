package com.project.service;

import com.project.dto.UserDTO;

public interface UserService {
	
	boolean saveUser(UserDTO user);
	boolean updateUser(UserDTO user);
	boolean deleteUser(String email);
	UserDTO searchUser(String email);

}
