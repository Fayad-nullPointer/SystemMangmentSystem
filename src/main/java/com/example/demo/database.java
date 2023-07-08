package com.example.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    public static Connection DBconnect() throws ClassNotFoundException, SQLException{
        Connection conn=null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:STUDENTCOURSES/123@localhost/XE");

        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return conn;


    }
}
