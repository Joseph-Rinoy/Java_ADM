package com.cognizant.LearnMaven.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {



public Connection con;

public Connection connection() throws SQLException {

try {
Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","joseph123");
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
if(con != null) {
System.err.println("connection is created succesfully");
}else {
System.err.println("connection is not created successfully");
}
return con;
}

}
