package com.project.demo.utility;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        Connection con = DbConnection.establishConnection();
        if(con!=null)
        {
            System.out.println("Connected");
        }
        else
        {
            System.out.println("Not Connected");
        }
    }
}
