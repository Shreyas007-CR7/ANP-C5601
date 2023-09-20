package com.project.demo.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    static Connection con;
    
    public static Connection establishConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spiderman", "root", "root");
            return con;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
