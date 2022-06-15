package com.cognizant.LearnMaven.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {
	public static void main( String[] args ) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("com/cognizant/LearnMaven/collection/collection.xml");
	 Collection c1=(Collection)context.getBean("employee1");
	 
	System.out.println(c1);
}
}