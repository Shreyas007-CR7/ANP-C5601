package com.project.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.project.demo.beans.Customer;
import com.project.demo.utility.DbConnection;
   
public class CustomerDaoJdbc implements CustomerDao{
    private Connection con=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;

    @Override
    public void saveCustomer(Customer customer) {
        try
        {
            con = DbConnection.establishConnection();
            ps = con.prepareStatement("insert into customer(cname,email,password,cnf_password,contact) values(?,?,?,?,?)");
            ps.setString(1, customer.getCustomerName());
            ps.setString(2, customer.getEmail());
            ps.setString(3, customer.getPassword());
            ps.setString(4, customer.getConfirmPassword());
            ps.setLong(5, customer.getContactNo());
            //ps.setTimestamp(1, customer.getDateOfBirth().);
            
            int rows = ps.executeUpdate();
            if(rows>0)
            {
                System.out.println("Data Saved successfully......................................");
            }
            else
            {
                System.out.println("Data is not Saved .....................................");
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                ps.close();
                con.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        try
        {
            con = DbConnection.establishConnection();
            ps = con.prepareStatement("update customer set cname=?,email=?,password=?,cnf_password=?,contact=? where id=?");
            ps.setString(1, customer.getCustomerName());
            ps.setString(2, customer.getEmail());
            ps.setString(3, customer.getPassword());
            ps.setString(4, customer.getConfirmPassword());
            ps.setLong(5, customer.getContactNo());
            ps.setInt(6, customer.getId());
            //ps.setTimestamp(1, customer.getDateOfBirth().);
            
            int rows = ps.executeUpdate();
            if(rows>0)
            {
                System.out.println("Data Updated successfully......................................");
                return true;
                
            }
            else
            {
                System.out.println("Data is not updated as yet .....................................");
                return false;
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                ps.close();
                con.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public Customer searchCustomer(int id) {
        return null;
    }

    @Override
    public List<Customer> showCustomers() {
        List<Customer> custList = new ArrayList<>();
        try
        {
            con = DbConnection.establishConnection();
            ps = con.prepareStatement("select * from customer order by id");
            rs = ps.executeQuery();
            while(rs.next())
            {
                int id = rs.getInt(1);
                String n = rs.getString(2);
                String e = rs.getString(3);
                String p1 = rs.getString(4);
                String p2 = rs.getString(5);
                long c = rs.getLong(6);
                Customer cust = new Customer(id, n, e, p1, p2, c);
                custList.add(cust);
                
            }
            
            return custList;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                rs.close();
                ps.close();
                con.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void deleteCustomer(int id) {
        try
        {
            con = DbConnection.establishConnection();
            ps = con.prepareStatement("delete from customer where id=?");
            ps.setInt(1, id);
            
            int rows = ps.executeUpdate();
            if(rows>0)
            {
                System.out.println("Data deleted successfully......................................");
            }
            else
            {
                System.out.println("Data is not deleted as yet .....................................");
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                ps.close();
                con.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    }
    
}
