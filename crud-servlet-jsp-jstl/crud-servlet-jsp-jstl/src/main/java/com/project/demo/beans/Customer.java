package com.project.demo.beans;

import java.util.Date;
import java.time.LocalDate;

public class Customer{
   private int id;
   private String customerName,email,password,confirmPassword;
   //private LocalDate dateOfBirth;
   private long contactNo;

    public Customer() {
    }

    public Customer(String customerName, String email, String password, String confirmPassword, long contactNo) {
        this.customerName = customerName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.contactNo = contactNo;
    }

    public Customer(int id, String customerName, String email, String password, String confirmPassword, long contactNo) {
        this.id = id;
        this.customerName = customerName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.contactNo = contactNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
//    public Customer(String customerName, String email, String password, String confirmPassword, LocalDate dateOfBirth, long contactNo) {
//        this.customerName = customerName;
//        this.email = email;
//        this.password = password;
//        this.confirmPassword = confirmPassword;
//        this.dateOfBirth = dateOfBirth;
//        this.contactNo = contactNo;
//    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

//    public LocalDate getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(LocalDate dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", customerName=" + customerName + ", email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword + ", contactNo=" + contactNo + '}';
    }

  
   
}
