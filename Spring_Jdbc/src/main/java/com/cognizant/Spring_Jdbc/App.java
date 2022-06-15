package com.cognizant.Spring_Jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate jdbcTemplate= context.getBean("jdbcTemplate",JdbcTemplate.class);
        String query="insert into student_details(sName,lName,place)values(?,?,?)";
        int result=jdbcTemplate.update(query,"test","test","test");
        System.out.println("insert successful");
    }
}
