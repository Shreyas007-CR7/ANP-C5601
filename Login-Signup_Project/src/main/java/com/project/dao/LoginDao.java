package com.project.dao;

import com.project.dto.UserDTO;

public interface LoginDao {
	UserDTO searchUser(String username);
}
