package com.cognizant.LearnMaven;

import java.sql.SQLException;

import com.cognizant.LearnMaven.connection.DatabaseConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello World!" );
        
        DatabaseConnection db = new DatabaseConnection();
        db.connection();
    }
}
