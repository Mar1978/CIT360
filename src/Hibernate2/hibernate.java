/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate2;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mikeg
 */
public class hibernate {
       
    private static final String USERNAME= "root";
    private static final String PASSWORD= "root";
    private static final String CONN_STRING= 
                    "jdbc:mysql://;localhost:3306/database_cit_360";
    
    public static void main(String[] args) {
        Connection conn = null;
        
        
        try {
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected");
            
        }catch (SQLException e){
            System.err.println(e);                
        }
    }
        
    
}


