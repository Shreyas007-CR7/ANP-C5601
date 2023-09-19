package com.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.dao.UserDao;
import com.project.dto.UserDTO;
import com.project.utility.DbConnection;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean saveUser(UserDTO user) {
		
		Connection con = null;
		PreparedStatement ps = null;	
		try {
			con = DbConnection.establishConnection();
			
			if(con!=null) {
				System.out.println("Connected");
			}else {
				System.out.println("Not Connected");
			}
			ps = con.prepareStatement("insert into tbl_signup(id, name,email,password,address) values(?,?,?,?,?)");
			
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getAddress());

			int rows = ps.executeUpdate();
			if (rows > 0) {
				return true;
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
		return false;
	}

	@Override
	public boolean updateUser(UserDTO user) {
		Connection con = null;
		PreparedStatement ps = null;	
		try {
			con = DbConnection.establishConnection();
			
			if(con!=null) {
				System.out.println("Connected");
			}else {
				System.out.println("Not Connected");
			}
			ps = con.prepareStatement("update tbl_signup set name=? ,password=?,address=? where email=?");
			
			ps.setString(1, user.getName());
			ps.setString(4, user.getEmail());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getAddress());

			int rows = ps.executeUpdate();
			if (rows > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null && con !=null) {
					ps.close();
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean deleteUser(String email) {
		Connection con = null;
		PreparedStatement ps = null;	
		try {
			con = DbConnection.establishConnection();
			
			ps = con.prepareStatement("delete from tbl_signup where email = ? ");
			
			ps.setString(1, email);

			int rows = ps.executeUpdate();
			if (rows > 0) {
				return true;
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
		return false;
	}

	@Override
	public UserDTO searchUser(String email) {
		Connection con = null;
		PreparedStatement ps = null;
		UserDTO user = null;
		try {
			con = DbConnection.establishConnection();
			
			ps = con.prepareStatement("select * from tbl_signup where email=?");
			
			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String emailid = rs.getString("email");
				String pass = rs.getString("password");
				String address = rs.getString("address");
				user = new UserDTO(id, name, emailid, pass, address);
			}
			System.out.println("Searched Data: "+user+" in Dao layer");
			return user;
			

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
		return user;
	}

}
