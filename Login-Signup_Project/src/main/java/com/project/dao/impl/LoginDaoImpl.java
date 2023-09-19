package com.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.dao.LoginDao;
import com.project.dto.UserDTO;
import com.project.utility.DbConnection;

public class LoginDaoImpl implements LoginDao {

	@Override
	public UserDTO searchUser(String username) {
		
		Connection con = null;
		PreparedStatement ps = null;	
		try {
			con = DbConnection.establishConnection();
			
			if(con!=null) {
				System.out.println("Connected");
			}else {
				System.out.println("Not Connected");
			}
			ps = con.prepareStatement("select * from tbl_signup where email=?");
			ps.setString(1, username);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String email = rs.getString("email");
				String pass = rs.getString("password");
				UserDTO user = new UserDTO();
				user.setEmail(email);
				user.setPassword(pass);
				return user;
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	

	

}
