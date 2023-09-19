package com.project.demo.dao;

import java.util.List;

import com.project.demo.beans.Customer;

public interface CustomerDao {
    void saveCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    Customer searchCustomer(int id);
    List<Customer> showCustomers();
    void deleteCustomer(int id);
    
}
